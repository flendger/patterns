package ru.flendger.patterns.abstractfactory;

import java.util.ArrayList;
import java.util.List;

public class AbstractFactoryDemo {
    public static void main(String[] args) {
        List<Chair> chairs = new ArrayList<>();
        List<Table> tables = new ArrayList<>();

        MyFactory factory;
        factory = new MyFactoryA();
        chairs.add(factory.createChair());
        tables.add(factory.createTable());

        factory = new MyFactoryB();
        chairs.add(factory.createChair());
        tables.add(factory.createTable());

        for (int i = 0; i < chairs.size(); i++) {
            chairs.get(i).getChairWeight();
            tables.get(i).getTableColor();
        }
    }
}
