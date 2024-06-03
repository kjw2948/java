package generic.ex3;

import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalHospitalMainV1 {

    public static void main(String[] args) {
        AnimalHospitalV1 dogHospital = new AnimalHospitalV1();
        AnimalHospitalV1 catHospital = new AnimalHospitalV1();

        Dog dog = new Dog("멍멍이1", 100);
        Cat cat = new Cat("야옹이1", 300);

        dogHospital.set(dog);
        dogHospital.checkUp();

        catHospital.set(cat);
        catHospital.checkUp();

        dogHospital.set(dog);
        Dog biggerDog = (Dog) dogHospital.bigger(new Dog("멍멍이2", 300));
        System.out.println("biggerDog = " + biggerDog);

    }
}
