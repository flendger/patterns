package ru.flendger.patterns.composite;

public class CompositeDemo {
    public static void main(String[] args) {
        BoxPack mainBox = new BoxPack(1);
        mainBox.addItem(new Product(2));
        mainBox.addItem(new Product(3));

        BoxPack b1 = new BoxPack(1);
        b1.addItem(new Product(4));
        mainBox.addItem(b1);

        System.out.println(mainBox.getPrice());
        mainBox.getItems().forEach(System.out::println);
    }
}
