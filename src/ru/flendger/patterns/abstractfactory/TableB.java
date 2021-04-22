package ru.flendger.patterns.abstractfactory;

public class TableB implements Table{
    @Override
    public void getTableColor() {
        System.out.println("Color table B");
    }
}
