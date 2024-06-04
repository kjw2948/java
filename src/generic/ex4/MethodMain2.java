package generic.ex4;

import generic.animal.Cat;
import generic.animal.Dog;

public class MethodMain2 {

    public static void main(String[] args) {
        Dog dog = new Dog("멍멍이", 100);
        Cat cat = new Cat("야옹이", 300);

        AnimalMethod.checkUp(dog);
        AnimalMethod.checkUp(cat);

        Dog targetDog = new Dog("큰 멍멍이", 500);
        Dog biggerDog = AnimalMethod.bigger(targetDog, dog);
        System.out.println("biggerDog = " + biggerDog);
    }
}
