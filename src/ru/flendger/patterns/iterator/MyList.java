package ru.flendger.patterns.iterator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;

public class MyList<T> implements IterableCollection<T>, IterableCollectionDesc<T>{
    private final List<T> list;

    public MyList() {
        list = new ArrayList<>();
    }

    public List<T> getList() {
        return Collections.unmodifiableList(list);
    }

    public void add(T item) {
        list.add(item);
    }

    @Override
    public MyIterator<T> iterator() {
        return new MyIter();
    }

    @Override
    public MyIterator<T> iteratorDesc() {
        return new MyIterDesc();
    }

    private class MyIter implements MyIterator<T> {
        private int curIdx = -1;

        @Override
        public boolean hasNext() {
            return (curIdx + 1) >= 0 && (curIdx + 1) < list.size();
        }

        @Override
        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException("end of list");
            }

            curIdx ++;
            return list.get(curIdx);
        }
    }

    private class MyIterDesc implements MyIterator<T> {
        private int curIdx = list.size();

        @Override
        public boolean hasNext() {
            return (curIdx - 1) >= 0 && (curIdx - 1) < list.size();
        }

        @Override
        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException("end of list");
            }

            curIdx --;
            return list.get(curIdx);
        }
    }
}
