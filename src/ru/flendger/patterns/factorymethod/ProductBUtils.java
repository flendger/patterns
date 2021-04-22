package ru.flendger.patterns.factorymethod;

public class ProductBUtils extends AbstractProductUtils{
    @Override
    public MyProduct createProduct() {
        return new ProductB();
    }
}
