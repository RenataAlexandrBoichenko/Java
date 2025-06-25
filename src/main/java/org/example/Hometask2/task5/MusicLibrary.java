package org.example.Hometask2.task5;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

class MusicLibrary {
    private HashMap<String, HashSet<MusicTrack>> tracksByGenre;

    public MusicLibrary() {
        tracksByGenre = new HashMap<>();
    }

    // Метод для добавления трека в библиотеку
    public void addTrack(MusicTrack track) {
        String genre = track.getGenre();
        if (!tracksByGenre.containsKey(genre)) {
            tracksByGenre.put(genre, new HashSet<>());
        }
        tracksByGenre.get(genre).add(track);
    }

    // Метод для удаления трека из библиотеки
    public void removeTrack(MusicTrack track) {
        String genre = track.getGenre();
        if (tracksByGenre.containsKey(genre)) {
            tracksByGenre.get(genre).remove(track);

    // Если после удаления жанр пуст, удаляем его из HashMap
            if (tracksByGenre.get(genre).isEmpty()) {
                tracksByGenre.remove(genre);
            }
        }
    }

    // Метод для получения всех треков заданного жанра
    public Set<MusicTrack> getTracksByGenre(String genre) {
        return tracksByGenre.getOrDefault(genre, new HashSet<>());
    }
}
