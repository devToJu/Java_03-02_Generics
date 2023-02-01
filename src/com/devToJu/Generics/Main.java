package com.devToJu.Generics;

public class Main {
    public static void main(String[] args) {
        var users = new UpToTenElementsOfSameType<User>();
        users.add(new User("A", "1"));
        users.add(new User("B", "2"));
        printUsers(users);

        var admins = new UpToTenElementsOfSameType<Admin>();
        admins.add(new Admin("x", "1"));
        admins.add(new Admin("y", "2"));
        printUsers(admins);

        var numbers = new UpToTenElementsOfSameType<Integer>();
        numbers.add(10);
        numbers.add(23);
        printUsers(numbers);
    }

    private static void printUsers(UpToTenElementsOfSameType tenItems) {
        for (int i = 0; i < tenItems.getCount(); i++) {
            System.out.println(tenItems.get(i));
        }
    }
}
