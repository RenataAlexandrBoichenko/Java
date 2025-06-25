package org.example.Hometask2.task1;


/**Создайте класс Student с полями для хранения имени и ID студента.
В классе StudentManager используйте ArrayList<Student> для хранения списка студентов.
Реализуйте методы для добавления нового студента в список, удаления студента по ID и получения списка всех студентов.
*/

public class Main {
    public static void main(String[] args) {
         //если сис-ма такая что id НЕ изменяется после создания студента - SET не подходит
        // если сис-ма такая что id изменяется после создания студента - SET подходит, так как при сетах любой может
        // изменить id
        Student student1 = new Student();
        Student student2 = new Student("Arisha", "001");
        Student student3 = new Student("Vadim");

        System.out.println(student1.toString()); //если бы в Student не б.бы создано Student{name='unknown', id='unknown'}
        System.out.println(student2.toString());      // - код бы упал, так как еще ни 1 студента не было создано
        System.out.println(student3.toString());

        StudentManager studentManager = new StudentManager();
        studentManager.addStudent(student1);
        studentManager.addStudent(student2);
        studentManager.addStudent(student3);

        //studentManager.removeStudent("id_Vadim");
        studentManager.removeStudent(student3.getId());

        System.out.println(studentManager.getStudents());
    }
}
