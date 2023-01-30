package com.devToJu.Generics;

public class Main {
    public static void main(String[] args) {
        var integerGenericList = new GenericList<Integer>(3);
        System.out.println(integerGenericList.add(1));
        System.out.println(integerGenericList.add(2));
        System.out.println(integerGenericList.add(3));
        System.out.println(integerGenericList.add(4));

        var stringGenericList = new GenericList<String>(3);
        stringGenericList.add("Much better...");
        stringGenericList.add("... only defined types an subclasses allowed");
        stringGenericList.add("... String is immutable -> only Strings allowed -> no type checking needed");

        for (int i = 0; i < stringGenericList.getCount(); i++) {
            String text = stringGenericList.get(i).toUpperCase();
            System.out.println(text);
        }
    }
}
