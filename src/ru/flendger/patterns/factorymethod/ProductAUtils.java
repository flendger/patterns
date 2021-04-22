package ru.flendger.patterns.factorymethod;

public class ProductAUtils extends AbstractProductUtils{
    @Override
    public MyProduct createProduct() {
        return new ProductA();
    }
}
