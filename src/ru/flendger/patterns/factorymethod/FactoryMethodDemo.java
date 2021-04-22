package ru.flendger.patterns.factorymethod;

import java.util.ArrayList;
import java.util.List;

public class FactoryMethodDemo {
    public static void main(String[] args) {
        List<MyProduct> list = new ArrayList<>();
        AbstractProductUtils productFactory;

        productFactory= new ProductAUtils();
        list.add(productFactory.createProduct());
        list.add(productFactory.createProduct());

        productFactory = new ProductBUtils();
        list.add(productFactory.createProduct());
        list.add(productFactory.createProduct());
        list.add(productFactory.createProduct());

        productFactory.workProducts(list);
    }
}
