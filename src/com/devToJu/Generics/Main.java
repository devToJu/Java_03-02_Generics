package com.devToJu.Generics;

public class Main {
    public static void main(String[] args) {
        System.out.println("The user who ist online the most is " + getUserWithMaxOnlineTime());
        System.out.println("The biggest value is " + getMaxValue());
        System.out.println("String comparing returns: " + getMaxString());
    }

    private static User getUserWithMaxOnlineTime() {
        var userA = new User("schnuffy23", "bad_decision");
        var userB = new User("test0815", "password1234");

        return userA.getHoursOnline() > userB.getHoursOnline()
                ? userA
                : userB;
    }

    private static Double getMaxValue() {
        var a = Double.valueOf(Math.random() * 10.4);
        var b = Double.valueOf(Math.random() * 13.7);

        return a > b ? a : b;
    }

    private static String getMaxString() {
        var textA = "Hello? Hello!";
        var textB = "What's going on?";

        return textA.compareTo(textB) > 0 ? textA : textB;
    }
}
