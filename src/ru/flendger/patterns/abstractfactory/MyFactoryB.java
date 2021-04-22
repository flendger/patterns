package ru.flendger.patterns.abstractfactory;

public class MyFactoryB implements MyFactory{
    @Override
    public Chair createChair() {
        return new ChairB();
    }

    @Override
    public Table createTable() {
        return new TableB();
    }
}
