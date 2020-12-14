package Bili1213;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayAndList {
    public static void main(String[] args) {
        ArrayList<Student> arrayList = new ArrayList<>();
        while (true) {
            //  界面编写
            display();
            Scanner sc = new Scanner(System.in);
            String func = sc.nextLine();
            switch (func) {
                case "1":
                    addStudent(arrayList);
                    break;
                case "2":
                    System.out.println("delete student");
                    break;
                case "3":
                    String sid = sc.nextLine();
                    changeStudent(arrayList, sid);
                    break;
                case "4":
                    checkStudent(arrayList);
                    break;
                case "5":
                    System.out.println("add student");
                    System.exit(0);
            }
        }

    }

    public static void display() {
        System.out.println("welcome to student manage system");
        System.out.println("1 add student");
        System.out.println("2 delete student");
        System.out.println("3 change student");
        System.out.println("4 check student");
        System.out.println("5 exit");
    }

    public static void addStudent(ArrayList<Student> array) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input student sid:");
        String sid = sc.nextLine();
        System.out.println("input student name:");
        String name = sc.nextLine();
        System.out.println("input student age:");
        String age = sc.nextLine();
        System.out.println("input student address:");
        String address = sc.nextLine();
        Student s = new Student(sid, name, age, address);
        array.add(s);
        System.out.println("add student success!");
    }

    public static void checkStudent(ArrayList<Student> array) {
        if (array.size() <= 0) {
            System.out.println("no student!");
            return;
        }
        System.out.println("sid" + "\t" + "name" + "\t" + "age" + "address");
        array.forEach(student -> {
            System.out.println(student.getSid() + "\t" + student.getName() + "\t" +
                    student.getAge() + "\t" + student.getAddress());
        });
    }

    public static void changeStudent(ArrayList<Student> array, String sid) {
        array.forEach(student -> {
            if (student.getSid().equals(sid)) {
                Scanner sc = new Scanner(System.in);
                System.out.println("input student new address:");
                String address = sc.nextLine();
                student.setAddress(address);
            }
        });
    }
}
