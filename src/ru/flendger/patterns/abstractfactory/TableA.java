package ru.flendger.patterns.abstractfactory;

public class TableA implements Table{
    @Override
    public void getTableColor() {
        System.out.println("Color table A");
    }
}
