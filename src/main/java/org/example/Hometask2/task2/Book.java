package org.example.Hometask2.task2;

import java.util.HashSet;
import java.util.Objects;

public class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
    // Геттеры

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }


    // Переопределяем equals и hashCode для корректной работы HashSet
    @Override
    public int hashCode() {
        return Objects.hash(title);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) {
            return false;
        }
        Book book = (Book) o;
        return title.equals(book.title);
    }


    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}