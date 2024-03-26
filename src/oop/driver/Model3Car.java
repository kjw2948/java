package oop.driver;

public class Model3Car implements Car{
    @Override
    public void startEngine() {
        System.out.println("Model3Car.startEngine");
    }
    @Override
    public void offEngine() {
        System.out.println("Model3Car.offEngine");
    }
    @Override
    public void pressAccelator() {
        System.out.println("Model3Car.pressAccelator");
    }
}
