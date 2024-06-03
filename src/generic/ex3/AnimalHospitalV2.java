package generic.ex3;


import generic.animal.Animal;

// extends를 사용하여 T에는 Animal과 자식들만 들어올 수 있다. 로 제한할 수 있음  --> 타입 매개변수 제한
public class AnimalHospitalV2<T extends Animal> {

    private T animal;

    public void set(T animal) {
        this.animal = animal;
    }

    public void checkUp() {
        System.out.println("동물 이름 : " + animal.getName());
        System.out.println("동물 크기 : " + animal.getSize());
        animal.sound();
    }

    public T bigger(T target) {
        return animal.getSize() > target.getSize() ? animal : target;
    }
}
