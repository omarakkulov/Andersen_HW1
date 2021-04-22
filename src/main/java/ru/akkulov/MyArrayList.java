package ru.akkulov;

import java.util.Iterator;

public class MyArrayList<T> implements MyListInterface<T> {
    T[] values;

    MyArrayList() {
        this.values = (T[]) new Object[0];
    }

    @Override
    public boolean add(T t) {
        try {
            T[] temp = values;
            values = (T[]) new Object[temp.length + 1];

            System.arraycopy(temp, 0, // from where
                    values, 0, // where to
                    temp.length); // count
            values[values.length - 1] = t;

            return true;
        } catch (ClassCastException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public void remove(int index) {
        try {
            T[] temp = values;
            values = (T[]) new Object[temp.length - 1];
            System.arraycopy(temp, 0,
                    values, 0,
                    index);

            int countElementsAfterIndex = temp.length - index - 1;
            System.arraycopy(temp, index + 1,
                    values, index,
                    countElementsAfterIndex);
        } catch (ClassCastException | ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
    }

    @Override
    public T get(int index) {
        return values[index];
    }

    @Override
    public int size() {
        return values.length;
    }

    @Override
    public void update(int index, T t) {
        values[index] = t;
    }

    @Override
    public Iterator<T> iterator() {
        return new MyIterator<>(values);
    }
}
