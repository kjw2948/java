package oop.driver;

public class Driver {
    private K3Car k3Car;
    void setK3Car(K3Car k3Car){
        this.k3Car = k3Car;
    }
    void drive() {
        System.out.println("자동차를 운전합니다");
        k3Car.startEngine();
        k3Car.offEngine();
        k3Car.pressAccelator();

    }
}
