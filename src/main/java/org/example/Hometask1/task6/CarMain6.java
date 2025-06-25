package org.example.Hometask1.task6;

import org.example.Hometask1.Drivable;

public class CarMain6 implements Drivable {
    private boolean moving = false;
    private double speed = 0; // км/ч
    private double totalDistance = 0;

    @Override
    public void start() {
        if (speed == 0) {
            System.out.println("Please enter the speed first.");
        } else {
            moving = true;
            System.out.println("Let's go at a speed of " + speed + " km/h for 1 hour");
        }
    }

    @Override
    public void stop() {
        moving = false;
        System.out.println("Stopped");
    }

    @Override
    public void setSpeed(double speed) {
        this.speed = speed;
        System.out.println("Speed set: " + speed + " km/h for 1 hour");
    }

    @Override
    public void drive() {
        if (moving) {
            totalDistance += speed; // допустим, проехали 1 час с текущей скоростью
            System.out.println("Driving at: " + speed + " km/h for 1 hour");
        } else {
            System.out.println("Start the car first.");
        }
    }

    public double getTotalDistance() {
        return totalDistance;
    }
}