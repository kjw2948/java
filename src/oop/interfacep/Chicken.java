package oop.interfacep;

public class Chicken extends AbstractAnimal implements Fly{
    @Override
    void sound() {
        System.out.println("꼬끼오");
    }

    @Override
    public void fly() {
        System.out.println("닭이 납니다");
    }
}
