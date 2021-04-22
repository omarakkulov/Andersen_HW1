package ru.akkulov;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MyArrayListTest {
    private MyListInterface<Integer> list;

    {
        list = new MyArrayList<>();
    }

    @org.junit.jupiter.api.Test
    void size() {
        list.add(50);
        list.add(100);
        list.add(150);

        assertEquals(3, list.size());

        list.add(200);
        list.add(250);

        assertEquals(5, list.size());
    }

    @org.junit.jupiter.api.Test
    void add() {
        list.add(50);
        list.add(100);
        list.add(150);
        assertEquals(50, list.get(0), "Should be added 50");
        assertEquals(100, list.get(1), "Should be added 100");
        assertEquals(150, list.get(2), "Should be added 150");
        assertEquals(3, list.size(), "Should be 3 elements");
    }

    @org.junit.jupiter.api.Test
    void remove() {
        list.add(50);
        list.add(100);
        list.add(150);
        list.add(200);
        list.add(250);

        list.remove(1);
        list.remove(2);
        assertEquals(3, list.size(), "Should be 3 elements");
    }

    @org.junit.jupiter.api.Test
    void get() {
        list.add(50);
        list.add(100);
        list.add(150);
        list.add(200);
        list.add(250);

        assertEquals(200, list.get(3));
        assertEquals(250, list.get(4));
    }

    @org.junit.jupiter.api.Test
    void update() {
        list.add(50);
        list.add(100);
        list.add(150);
        list.add(200);
        list.add(250);

        list.update(0, 1000);
        list.update(1, 5000);

        assertEquals(1000, list.get(0));
        assertEquals(5000, list.get(1));
    }
}