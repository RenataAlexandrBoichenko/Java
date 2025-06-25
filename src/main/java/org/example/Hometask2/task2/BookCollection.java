package org.example.Hometask2.task2;

import java.util.HashSet;

public class BookCollection {
    private HashSet<Book> books = new HashSet<>();

    // Добавление книги
 // возвращает false, если книга уже есть
    public boolean  addBook(Book book) {
        return books.add(book);
    }

// Удаление книги из коллекции
    public boolean removeBook(Book book) {
        return books.remove(book);
    }


    // Проверка наличия книги в коллекции
    public boolean containsBook(Book book) {
        return books.contains(book);
    }

    // Получение количества книг в коллекции
    public int getCollectionSize() {
        return books.size();
    }

    // Вывод всех книг в коллекции
    public void printAllBooks() {
        if (books.isEmpty()) {
            System.out.println("The collection is empty.");
            return;
        }
        System.out.println("Books in collection:");
        for (Book book : books) {
            System.out.println(book);
        }
    }
}
