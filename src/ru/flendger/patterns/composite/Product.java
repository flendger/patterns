package ru.flendger.patterns.composite;

public class Product implements OrderItem{
    private final int price;

    public Product(int price) {
        this.price = price;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "product " + price;
    }
}
