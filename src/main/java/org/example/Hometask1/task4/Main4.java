package org.example.Hometask1.task4;

import java.util.Scanner;

public class Main4 {
      public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);

          // Ввод начальных координат
          System.out.print("Please enter the starting value for X: ");
          int startX = scanner.nextInt();

          System.out.print("Please enter the starting value for Y: ");
          int startY = scanner.nextInt();

          PointMain4 pointMain4 = new PointMain4(startX, startY);
          pointMain4.moveUp();     // Moved up to (0, 1)
          pointMain4.moveRight();  // Moved right to (1, 1)
          pointMain4.moveDown();   // Moved down to (1, 0)
          pointMain4.moveLeft();   // Moved left to (0, 0)
        }
    }

