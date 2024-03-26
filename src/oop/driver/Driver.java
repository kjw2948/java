package oop.driver;

public class Driver {
    private Car car;

    public void setCar(Car car) {
        System.out.println("자동차를 설정합니다 " + car);
        this.car = car;
    }

    void drive(Car car) {
        System.out.println("자동차를 운전합니다");
        car.startEngine();
        car.offEngine();
        car.pressAccelator();
    }
}
