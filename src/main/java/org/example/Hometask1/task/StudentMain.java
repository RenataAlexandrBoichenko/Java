package org.example.Hometask1.task;

import org.example.Hometask1.Printable;

public class StudentMain implements Printable {
        private String name;
        private String bookNumber;
        private double avgGrade;

    //сеттеры
        public void setName(String name) {
            this.name = name;
        }
        public void setBookNumber(String bookNumber) {
            this.bookNumber = bookNumber;
        }
        public void setAvgGrade(double avgGrade) {
            this.avgGrade = avgGrade;
        }

        // геттеры
        public String getName() {
            return this.name;
        }
        public String getBookNumber() {
        return this.bookNumber;
        }
        public double getAvgGrade() {
        return this.avgGrade;
        }


        @Override
        public void print() {
            System.out.println("Student name: " + this.name);
            System.out.println("Book Number: " + this.bookNumber);
            System.out.println("Average grade: " + this.avgGrade);
        }
}
