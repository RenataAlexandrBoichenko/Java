package org.example.Hometask1.task5;

public class Main5 {
    public static void main(String[] args) throws InterruptedException {
        ClockMain5 clock = new ClockMain5();

        // Показываем время и увеличиваем каждую секунду 5 раз
        for (int i = 0; i < 5; i++) {
            clock.tick();
            Thread.sleep(1000); // пауза 1 секунда
        }
    }
}
