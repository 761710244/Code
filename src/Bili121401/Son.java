package Bili121401;

public class Son extends Parent {
    public int age = 20;

    public void show() {
        int age = 30;
        System.out.println(age);
        System.out.println(this.age);
        System.out.println(super.age);
    }

    public Son() {
        System.out.println("Son no param used!");
    }

    public Son(int age) {
        System.out.println("parent with param used!");
    }

    @Override
    public void method(String age) {
        System.out.println("this is Son");
        super.method(age);
    }
}
