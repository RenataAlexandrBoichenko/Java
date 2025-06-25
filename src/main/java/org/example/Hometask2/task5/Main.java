package org.example.Hometask2.task5;

import org.example.Hometask2.task5.MusicLibrary;


/**Создайте класс MusicTrack с полями для названия трека, исполнителя и жанра.
В классе MusicLibrary используйте HashMap<String, HashSet<MusicTrack>> для организации музыкальных треков по жанрам, где ключом является жанр, а значением - набор треков этого жанра.
Реализуйте методы для добавления трека в библиотеку, удаления трека из библиотеки и получения всех треков заданного жанра.
*/

public class Main {
    public static void main(String[] args) {
        MusicLibrary library = new MusicLibrary();

        // Создаем треки
        MusicTrack track1 = new MusicTrack("Love Java", "Martin", "pops");
        MusicTrack track2 = new MusicTrack("Hate Java", "Robert Martin", "rap");
        MusicTrack track3 = new MusicTrack("Missing Java", "Joshua Bloch", "pops");
        MusicTrack track4 = new MusicTrack("Returning Java", " Bloch", "rock");

        // Добавляем треки
        library.addTrack(track1);
        library.addTrack(track2);
        library.addTrack(track3);
        library.addTrack(track4);

        // Получаем все треки жанра "rock" и выводим их
        System.out.println("rock tracks:");
        for (MusicTrack track : library.getTracksByGenre("rock")) {
            System.out.println(track);
        }


        // Удаляем трек и проверяем
        library.removeTrack(track2);
        System.out.println("\nrap tracks deleted: " + track2);
        for (MusicTrack track : library.getTracksByGenre("rap")) {
            System.out.println(track);
        }

        // Выводим pops треки
        System.out.println("\npops tracks:");
        for (MusicTrack track : library.getTracksByGenre("pops")) {
            System.out.println(track);
        }
    }
}