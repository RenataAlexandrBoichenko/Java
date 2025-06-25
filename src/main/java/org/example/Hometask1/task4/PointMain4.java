package org.example.Hometask1.task4;

import org.example.Hometask1.Movable;

public class PointMain4 implements Movable {
    private int x;
    private int y;

    public PointMain4(int startX, int startY) {
            this.x = startX;
            this.y = startY;
        }
    @Override
        public void moveUp() {
            y++;
            System.out.println("Moved up to (" + x + ", " + y + ")");
        }

    @Override
        public void moveDown() {
            y--;
            System.out.println("Moved down to (" + x + ", " + y + ")");
        }

    @Override
        public void moveLeft() {
            x--;
            System.out.println("Moved left to (" + x + ", " + y + ")");
        }

    @Override
        public void moveRight() {
            x++;
            System.out.println("Moved right to (" + x + ", " + y + ")");
        }
    }
