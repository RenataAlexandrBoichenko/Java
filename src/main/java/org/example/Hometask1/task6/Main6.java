package org.example.Hometask1.task6;
import org.example.Hometask1.Drivable;

import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
        Drivable car = new CarMain6();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Commands: 1 step -speed <number>, 2 step - start, 3 step - drive, 4 step - stop, 5 step - distance");

        while (true) {
            System.out.print("> ");
            String input = scanner.nextLine().trim().toLowerCase();

            if (input.equals("distance")) {
                System.out.println("Total distance " + ((CarMain6) car).getTotalDistance() + " km");
                break;
            } else if (input.startsWith("speed")) {
                try {
                    double s = Double.parseDouble(input.split("\\s+")[1]);
                    car.setSpeed(s);
                } catch (Exception e) {
                    System.out.println("Enter: speed <number>");
                }
            } else if (input.equals("start")) {
                car.start();
            } else if (input.equals("stop")) {
                car.stop();
            } else if (input.equals("drive")) {
                car.drive(); // симулируем 1 час езды
            } else {
                System.out.println("I don't understand.");
            }
        }

        scanner.close();
    }
}