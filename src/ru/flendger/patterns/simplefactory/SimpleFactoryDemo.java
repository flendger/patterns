package ru.flendger.patterns.simplefactory;

public class SimpleFactoryDemo {
    public static void main(String[] args) {
        CarFactory factory = new CarFactoryImp();
        factory.createCar("s").drive();
        factory.createCar("t").drive();
    }
}
