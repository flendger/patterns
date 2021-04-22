package ru.flendger.patterns.abstractfactory;

public class ChairB implements Chair{
    @Override
    public void getChairWeight() {
        System.out.println("weight chair B");
    }
}
