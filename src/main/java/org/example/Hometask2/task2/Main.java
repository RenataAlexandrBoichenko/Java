package org.example.Hometask2.task2;

import java.util.HashMap;

/**Создайте класс Book с полями для названия и автора.
В классе BookCollection используйте HashSet<Book> для хранения коллекции книг без дубликатов.
Реализуйте методы для добавления книги в коллекцию, удаления книги из коллекции и проверки, содержится ли книга в коллекции.
*/

public class Main {
    public static void main(String[] args) {
        // Создаем HashSet для хранения книг
        BookCollection collection = new BookCollection();

        Book book1 = new Book("Effective Java", "Joshua Bloch");
        Book book2 = new Book("Clean Code", "Robert Martin");
        Book book3 = new Book("Effective Java", "Joshua Bloch"); // Дубликат book1

        // Добавляем книги
        System.out.println("Adding book1: " + collection.addBook(book1)); // true
        System.out.println("Adding book2: " + collection.addBook(book2)); // true
        System.out.println("Adding book3 (duplicate): " + collection.addBook(book3)); // false

        // Проверяем наличие
        System.out.println("\nContains \"Clean Code\": " +
            collection.containsBook(new Book("Clean Code", "Robert Martin"))); // true

        // Выводим коллекцию
        System.out.println("\nCollection status:");
        collection.printAllBooks();
        System.out.println("Total books: " + collection.getCollectionSize());

        // Удаляем книгу
        System.out.println("\nRemoving book2: " + collection.removeBook(book2)); // true
        collection.printAllBooks();
    }
}