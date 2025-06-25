package org.example.Hometask1.task;

public class Main {
    public static void main(String[] args) {
        StudentMain student1 = new StudentMain(); // оздали аккаунт
        student1.setName("Arina"); //выставили счет аккаунту
        student1.setBookNumber("VK 14567AN");
        student1.setAvgGrade(4.7);
        student1.print(); // распечатали
    }
}