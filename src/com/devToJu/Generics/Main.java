package com.devToJu.Generics;

public class Main {
    public static void main(String[] args) {
        var list = new GenericList(3);
        System.out.println(list.add(1));
        System.out.println(list.add(2));
        System.out.println(list.add(3));
        System.out.println(list.add(4));

        list = new GenericList(3);
        list.add("Not good...");
        list.add("... need type check or may throw exception");
        list.add(2);

        for (int i = 0; i < list.getCount(); i++) {
            if (!(list.get(i) instanceof String))
                continue;

            String text = ((String)list.get(i)).toUpperCase();
            System.out.println(text);
        }
    }
}