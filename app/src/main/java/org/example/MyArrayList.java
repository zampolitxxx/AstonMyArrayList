package org.example;

public class MyArrayList<E> {

    static final int INIT_CAPACITY = 10;
    private final Object[] array;

    public MyArrayList() {
        this.array = new Object[INIT_CAPACITY];
    }

    public MyArrayList(int capacity) throws IllegalArgumentException {
        if (capacity > 0 && capacity < Integer.MAX_VALUE) {
            this.array = new Object[capacity];
        } else {
            throw new IllegalArgumentException();
        }
    }

    // Inserts the specified element at the specified position in this list.
    void add(int index, E element) {
    }

    // Appends the specified element to the end of this list.
    boolean add(E e) {
        return true;
    }

    // Removes the element at the specified position in this list.
    E remove(int index) {
        return (E) array[index];
    }

    // Replaces the element at the specified position in this list with the specified element.
    E set(int index, E element) {
        return (E) array[index];
    }
    // return length of the MyArrayList
    public int length() {
        return array.length;
    }
}
