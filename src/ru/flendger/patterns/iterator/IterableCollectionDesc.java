package ru.flendger.patterns.iterator;

public interface IterableCollectionDesc<T> {
    MyIterator<T> iteratorDesc();
}
