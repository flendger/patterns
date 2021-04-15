package ru.flendger.patterns.factorymethod;

import java.util.List;

public abstract class AbstractProductUtils {
    public void workProducts(List<MyProduct> products) {
        products.forEach(MyProduct::doSomething);
    }

    public abstract MyProduct createProduct();
}
