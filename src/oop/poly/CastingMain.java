package oop.poly;

public class CastingMain {
    public static void main(String[] args) {
        Child child = new Child();
        Parent parent1 = (Parent) child;
        Parent parent2 = child;
        parent2 = new Child();

        parent1.parentMethod();
    }
}
