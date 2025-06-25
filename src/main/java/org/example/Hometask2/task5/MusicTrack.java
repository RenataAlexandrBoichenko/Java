package org.example.Hometask2.task5;

public class MusicTrack {
    private String track;
    private String singer;
    private String genre;

    public MusicTrack(String track, String singer, String genre) {
        this.track = track;
        this.singer = singer;
        this.genre = genre;
    }

    // Геттеры
    public String getTrack() {
        return track;
    }

    public String getSinger() {
        return singer;
    }

    public String getGenre() {
        return genre;
    }

        @Override
    public String toString() {
        return "Track: " + track + " | Singer: " + singer + " | Genre: " + genre;
    }
}
