package Bili121402;

public class Test {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        teacher.setName("pinganzhang");
        teacher.setAge(25);
        System.out.println(teacher.getName() + ", " + teacher.getAge());
        teacher.teach();

        Teacher teacher1 = new Teacher("pinganzhang1", 26);
        System.out.println(teacher1.getName() + ", " + teacher1.getAge());
        teacher1.teach();
    }
}
