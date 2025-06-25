package org.example.Hometask2.task4;

/**Создайте класс Task с полями для описания задачи и её приоритета.
В классе TaskManager используйте ArrayList<Task> для хранения списка задач.
Реализуйте методы для добавления задачи в список, удаления задачи из списка и сортировки списка задач по приоритету перед выводом.
*/

public class Main {
    public static void main(String[] args) {
        TaskManager taskmanager = new TaskManager();

        // Добавляем задачи с разными параметрами
        taskmanager.addTask(new Task("Complete homework", "Java HashCode", 3));
        taskmanager.addTask(new Task("Watch the lecture videos", "Java Hash Map", 5));
        taskmanager.addTask(new Task("Learn Java", "", 8));

        // Выводим задачи (автоматически сортируются)
        System.out.println("Before sorting:");
        taskmanager.printTasks();

        // Удаляем задачу
        System.out.println("\nRemove task 'Java HashCode'");
        taskmanager.removeTask("Java HashCode");
        taskmanager.printTasks();

    }
}

