package org.example.Hometask1.task5;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class ClockMain5 {
        private LocalTime time;

        public ClockMain5() {
            this.time = LocalTime.now();
        }
        public void tick() {
        // Увеличиваем время на 1 секунду
        time = time.plusSeconds(1);

        // Форматируем и выводим
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        System.out.println("Current time: " + time.format(formatter));
    }
}