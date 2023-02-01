package com.devToJu.Generics;

public class GenericList<T extends User> {
    private final T[] list;

    private int count;

    @SuppressWarnings("unchecked")
    public GenericList(int itemCount) {
        this.list = (T[]) new User[itemCount];
    }

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
