package Bili121401;

public class Parent {
    public int age = 40;

    public Parent() {
        System.out.println("parent no param used!");
    }

    public Parent(int age) {
        System.out.println("parent with param used!");
    }

    public void method(String age) {
        System.out.println("age is :" + age);
    }
}
