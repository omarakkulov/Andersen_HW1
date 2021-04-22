package ru.akkulov;

import java.util.Iterator;

public class MyIterator<T> implements Iterator<T> {
    private T[] values;
    private int index = 0;

    MyIterator(T[] values) {
        this.values = values;
    }

    @Override
    public boolean hasNext() {
        return index < values.length;
    }

    @Override
    public T next() {
        return values[index++];
    }
}
