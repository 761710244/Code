package Common;

import java.util.Arrays;
import java.util.Comparator;

public class Compare {

    public static class Student {
        public String name;
        public int id;
        public int age;

        public Student(String name, int id, int age) {
            this.name = name;
            this.id = id;
            this.age = age;
        }
    }

    public static class IdAscComparetor implements Comparator<Student> {

        @Override
        public int compare(Student o1, Student o2) {
            return o1.id - o2.id;
        }
    }

    public static void printStudents(Student[] students) {
        for (Student student : students) {
            System.out.println("Name : " + student.name + ", Id : " + student.id + ", Age : " + student.age);
        }
    }

    public static void main(String[] args) {
        Student student1 = new Student("A", 1, 30);
        Student student2 = new Student("B", 3, 20);
        Student student3 = new Student("C", 2, 10);

        Student[] students = {student1, student2, student3};
        Arrays.sort(students, new IdAscComparetor());
        printStudents(students);
    }
}
