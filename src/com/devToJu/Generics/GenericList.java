package com.devToJu.Generics;

public class GenericList {
    private final Object[] list;

    private int count;

    public GenericList(int itemCount) {
        this.list = new Object[itemCount];
    }

    public int getCount() {
        return count;
    }

    public boolean add(Object item) {
        if (count >= list.length) {
            return false;
        }

        list[count++] = item;
        return true;
    }

    public Object get(int index){
        if(index < 0 || index > count -1) {
            throw new IndexOutOfBoundsException("Invalid index " + index);
        }

        return list[index];
    }
}
