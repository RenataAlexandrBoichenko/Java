package org.example.Hometask1.task2;

import org.example.Hometask1.Displayable;

public class BookMain2 implements Displayable {
    private String text;

    public BookMain2(String text) {
        this.text = text;
    }

    @Override
    public void display() {
        System.out.println("Book information: " + text);
    }
}