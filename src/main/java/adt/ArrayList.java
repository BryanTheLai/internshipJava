// src/main/java/adt/ArrayList.java
package main.java.adt;

public class ArrayList<T> implements ListInterface<T> {
    private T[] items;
    private int size;
    private static final int DEFAULT_CAPACITY = 10;

    public ArrayList() {
        items = (T[]) new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    @Override
    public void add(T item) {
        if (size == items.length) {
            // For simplicity, not implementing resizing in this minimal example
            throw new IllegalStateException("ArrayList is full (minimal version)");
        }
        items[size++] = item;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int size() {
        return size;
    }
}