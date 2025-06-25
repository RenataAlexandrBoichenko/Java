package org.example.Hometask2.task4;

public class Task {
    private String title;
    private String description;
    private int priority;

    public Task(String title, String description, int i) {
        this.title = title;
        this.description = description;
        this.priority = priority;
    }

    // Геттеры
    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;

    }

    public int getPriority() {
        return priority;
    }

    @Override
    public String toString() {
        return String.format("[Priority %d] %s", priority, title,
                description.isEmpty() ? "no description" : description);
    }
}


