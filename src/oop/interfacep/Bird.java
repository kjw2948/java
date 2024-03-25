package oop.interfacep;

public class Bird extends AbstractAnimal implements Fly{
    @Override
    void sound() {
        System.out.println("삐약");
    }
    @Override
    public void fly() {
        System.out.println("새가 납니다");
    }
}
