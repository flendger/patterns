package ru.flendger.patterns.simplefactory;

public class SportCar implements Car{
    @Override
    public void drive() {
        System.out.println("Sport car");
    }
}
