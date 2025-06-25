package org.example.Hometask2.task1;

import java.util.ArrayList;  //ArrayList - массив

public class StudentManager {
    private ArrayList<Student> students;    //писать во множественном числе

    public StudentManager(ArrayList<Student> students) {
        this.students = students;
    }

    public StudentManager() {
        this.students = new ArrayList<>();  //создали пустой массив, чтоб сюда добавл студентов
    }

    public ArrayList<Student> getStudents() {
        return this.students;
    }
//set выбираем если знаем чо будем все убирать и заменять, контсруторк если по одному или парочке б.удалять и заменять


    public void addStudent(Student student) {
        this.students.add(student);
    }

    public void removeStudent(Student student) {
        students.remove(student);
    }

    public void removeStudent(String id) {
        // вариант 1:
        // 1) найти студента по id                 // а equals() используется для обьектов и классов (с большой буквы пишется)
        // 2) удалить по студенту                 //два студента явл равными если у них равны имена и айди

        Student targetStudent = null;           // чтобы удалить найденное, сначала надо сохранить это найденное, для этого
                                                // создаем переменную куда сохраним найденное
        for (Student student : students) {                //идем по всем студентам в Студентах
            if (student.getId().equals(id)) {               // условный оператор если - то - иначе
                targetStudent = student;                //"==" only для id, для обектов "==" писать нельзя - б. каказябра
            }                                            // найденного студента вкладываем в созданного targetStudent
        }

        if (targetStudent != null) {
             students.remove(targetStudent);        //delete найденного студента
        } else {
             System.out.println("Student with id " + " not found");
        }
           // students.removeIf(student -> student.getId().equals(id)); //delete по id
    }
}
