package org.example.Hometask1;

public class ClockSimulator {
    private int hours;
    private int minutes;
    private int seconds;

    public ClockSimulator(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public void tick() {
        seconds++;

        if (seconds >= 60) {
            seconds = 0;
            minutes++;
        }

        if (minutes >= 60) {
            minutes = 0;
            hours++;
        }

        if (hours >= 24) {
            hours = 0;
        }
    }

    public void printTime() {
        System.out.printf("Current time: %02d:%02d:%02d\n", hours, minutes, seconds);
    }
}
