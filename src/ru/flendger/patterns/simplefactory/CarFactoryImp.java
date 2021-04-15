package ru.flendger.patterns.simplefactory;

public class CarFactoryImp implements CarFactory{
    @Override
    public Car createCar(String carType) {
        if (carType.equals("s")) {
            return new SportCar();
        } else if (carType.equals("t")) {

            return new Truck();
        }
        return null;
    }
}
