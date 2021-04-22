package ru.flendger.patterns.simplefactory;

public class Truck implements Car{
    @Override
    public void drive() {
        System.out.println("Truck");
    }
}
