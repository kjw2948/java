package oop.interfacep;

public class AnimalMain {
    public static void main(String[] args) {
        AbstractAnimal[] animal = {new Dog(), new Chicken(), new Bird()};
        for (AbstractAnimal Animal : animal) {
            Animal.sound();
            Animal.move();
        }
        Bird bird = new Bird();
        Chicken chicken = new Chicken();
        animalFly(bird);
        animalFly(chicken);
    }
    public static void animalFly(Fly fly) {
        fly.fly();
    }
}
