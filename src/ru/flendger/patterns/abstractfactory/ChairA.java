package ru.flendger.patterns.abstractfactory;

public class ChairA implements Chair{
    @Override
    public void getChairWeight() {
        System.out.println("weight chair A");
    }
}
