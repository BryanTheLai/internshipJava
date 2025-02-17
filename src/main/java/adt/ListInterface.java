// src/main/java/adt/ListInterface.java
package main.java.adt;

public interface ListInterface<T> {
    void add(T item);
    boolean isEmpty();
    int size();
}