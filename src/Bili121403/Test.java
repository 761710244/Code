package Bili121403;

public class Test {

    public static void main(String[] args) {
        AnimalOperator ao = new AnimalOperator();

        Dog d = new Dog();
        ao.useAnimal(d);

        Pig p = new Pig();
        ao.useAnimal(p);
    }
}
