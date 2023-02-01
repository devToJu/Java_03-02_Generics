package com.devToJu.Generics;

public class UpToTenElementsOfSameType<T> {
    private final T[] list = (T[]) new Object[10];
    private int count;

    public int getCount() {
        return count;
    }

    public boolean add(T item) {
        if (count >= list.length) {
            return false;
        }

        list[count++] = item;
        return true;
    }

    public T get(int index){
        if(index < 0 || index > count -1) {
            throw new IndexOutOfBoundsException("Invalid index " + index);
        }

        return list[index];
    }
}
