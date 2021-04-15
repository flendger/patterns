package ru.flendger.patterns.factorymethod;

public class ProductA implements MyProduct{
    @Override
    public void doSomething() {
        System.out.println("Dance");
    }
}
