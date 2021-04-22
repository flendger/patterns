package ru.flendger.patterns.iterator;

public interface MyIterator<T> {
    boolean hasNext();
    T next();
}
