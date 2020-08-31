package test;

public class Test {

    public static int i = 0;

    public static void main(String[] args) {

        new Thread(() -> {
            System.out.println(Thread.currentThread() + " " + i);
            if (i < 50) {
                i++;
            }
        }, "A").start();

        new Thread(() -> {
            System.out.println(Thread.currentThread() + " " + i);
            if (i < 50) {
                i++;
            }
        }, "B").start();
    }
}
