package ru.flendger.patterns.prototype;

import java.util.ArrayList;
import java.util.List;

public class PrototypeDemo {
    public static void main(String[] args) {
        List<MyAbstractPrototype> l1 = new ArrayList<>();
        List<MyAbstractPrototype> l2 = new ArrayList<>();

        PrototypeR r1 = new PrototypeR();
        r1.setValue("v1");
        r1.setR("r1");
        l1.add(r1);

        PrototypeZ z1 = new PrototypeZ();
        z1.setValue("v2");
        z1.setX("x2");
        z1.setZ("z2");
        l1.add(z1);

        l1.forEach(i -> l2.add(i.clone()));

        for (int i = 0; i < l1.size(); i++) {
            System.out.println(l1.get(i).equals(l2.get(i)));
            System.out.println(l1.get(i) == l2.get(i));
        }
    }
}
