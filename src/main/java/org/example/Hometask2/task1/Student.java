package org.example.Hometask2.task1;

public class Student {
    private String name;
    private String id;

    //get всегда делаем

    public Student() {
        this.name = "unknown";
        this.id = "unknown";
    }

    public Student(String fullName, String id) {
        this.name = fullName;
        this.id = id;
    };

    public Student(String fullName) {
        this.name = fullName;
        this.id = "id_" + fullName;    // "id_" + fullName генерирует id по имени или генерация имени по id "fullName_" + idNumber
    };

    public String getName() {
        return name;
    };

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
