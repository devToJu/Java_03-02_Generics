package com.devToJu.Generics;

public class Main {
    public static void main(String[] args) {
        System.out.println("The user who ist online the most is " + getUserWithMaxOnlineTime());
        System.out.println("The biggest value is " + getMaxValue());
        System.out.println("String comparing returns: " + getMaxString());

        System.out.println("------------------------------------------------------");

        print("String Key", "String value");
        print(1, "String value");
        print(2, new User("noname", "1234"));
    }

    private static User getUserWithMaxOnlineTime() {
        var userA = new User("schnuffy23", "bad_decision");
        var userB = new User("test0815", "password1234");

        return max(userA, userB);
    }

    private static Double getMaxValue() {
        var a = Double.valueOf(Math.random() * 10.4);
        var b = Double.valueOf(Math.random() * 13.7);

        return max(a, b);
    }

    private static String getMaxString() {
        var textA = "Hello? Hello!";
        var textB = "What's going on?";

        return max(textA, textB);
    }

    private static <T extends Comparable> T max(T first, T second) {
        return first.compareTo(second) >= 0 ? first : second;
    }

    private static <K, V> void print(K key, V value) {
        System.out.println("key: " + key + " | value: " + value);
    }
}
