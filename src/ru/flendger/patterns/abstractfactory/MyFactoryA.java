package ru.flendger.patterns.abstractfactory;

public class MyFactoryA implements MyFactory{
    @Override
    public Chair createChair() {
        return new ChairA();
    }

    @Override
    public Table createTable() {
        return new TableA();
    }
}
