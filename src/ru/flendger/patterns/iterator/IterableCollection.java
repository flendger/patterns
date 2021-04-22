package ru.flendger.patterns.iterator;

public interface IterableCollection<T> {
    MyIterator<T> iterator();
}
