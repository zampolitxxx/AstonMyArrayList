package org.example;

public class MyArrayList<E> {

    static final int INIT_CAPACITY = 10;
    private Object[] array;
    private int currentSize;

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
        if (currentSize < size()) {
            array[currentSize++] = e;
        } else {
            resize();
            add(e);
        }
        return true;
    }

    // Remove the last element
    E remove() throws Exception {
        if (currentSize == 0) {
            throw new Exception("Array is empty");
        }
        Object oldElement = array[--currentSize];
        array[currentSize] = null;
        return (E) oldElement;
    }

    // Removes the element at the specified position in this list.
//    E remove(int index) throws Exception {
//        if (index < 0 || currentSize == 0) {
//            throw new Exception("Illegal ");
//        }
//        int newSize = array.length - 1;
//        Object[] buffArray = new Object[newSize];
//        return (E) index;
//    }

    // Replaces the element at the specified position in this list with the specified element.
    E set(int index, E element) {
        return (E) array[index];
    }
    // return length of the MyArrayList
    public int size() {
        return array.length;
    }

    private void resize() {
        int newLength = (int) (size() * 1.5) + 1;
        Object[] newArray = new Object[newLength];
        System.arraycopy(array, 0, newArray, 0, currentSize);
        array = newArray;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (Object elem : array) {
            sb.append(elem).append(", ");
        }
        sb.delete(sb.length() - 2, sb.length());
        sb.append("]");
        return sb.toString();
    }
}
