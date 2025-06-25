package org.example.Hometask2.task4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;

public class TaskManager {
    private ArrayList<Task> tasks = new ArrayList<>();

    // Добавление новой задачи
    public void addTask(Task task) {
        tasks.add(task);
    }

    // Удаление задачи по индексу
    public void removeTask(int index) {
        if (index >= 0 && index < tasks.size()) {
            tasks.remove(index);
        }
    }

    // Удаление задачи по описанию (первое вхождение)
    public boolean removeTask(String description) {
        for (int i = 0; i < tasks.size(); i++) {
            if (tasks.get(i).getDescription().equalsIgnoreCase(description.trim())) {
                tasks.remove(i);
                return true;
            }
        }
        return false;
    }

    // Сортировка задач по имени
    public void sortByTitle() {
        tasks.sort(Comparator.comparing(Task::getTitle));
    }

    // Сортировка по приоритету (по убыванию)
    public void sortByPriority() {
        Collections.sort(tasks, new Comparator<Task>() {
            @Override
            public int compare(Task t1, Task t2) {
                return Integer.compare(t2.getPriority(), t1.getPriority());
            }
        });
    }

    // Вывод всех задач
    public void printTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks available");
            return;
        }

        sortByPriority(); // Сортируем перед выводом
        System.out.println("Task List:");
        System.out.println("----------------------------");
        for (int i = 0; i < tasks.size(); i++) {
            System.out.printf("%d. %s%n", i+1, tasks.get(i));
        }
        System.out.println("----------------------------");
    }
}

