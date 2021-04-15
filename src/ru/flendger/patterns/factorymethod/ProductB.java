package ru.flendger.patterns.factorymethod;

public class ProductB implements MyProduct{
    @Override
    public void doSomething() {
        System.out.println("Run");
    }
}
