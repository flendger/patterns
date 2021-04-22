package ru.flendger.patterns.composite;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class BoxPack implements OrderItem {
    private final List<OrderItem> items;
    private final int boxPrice;

    public BoxPack(int boxPrice) {
        items = new ArrayList<>();
        this.boxPrice = boxPrice;
    }

    @Override
    public int getPrice() {
        return boxPrice + items.stream()
                .mapToInt(i -> i.getPrice())
                .sum();
    }

    public void addItem(OrderItem item) {
        items.add(item);
    }

    public void removeItem(OrderItem item) {
        Iterator<OrderItem> itemIterator = items.iterator();
        while (itemIterator.hasNext()) {
            if (itemIterator.next().equals(item)) {
                itemIterator.remove();
            }
        }
    }

    public List<OrderItem> getItems() {
        return Collections.unmodifiableList(items);
    }

    @Override
    public String toString() {
        return "box " + boxPrice;
    }
}
