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

        // Doesn't compile -> OK: Only Users should be in the list
        // printUsers(new UpToTenElementsOfSameType<Integer>());

        var mixedList = new UpToTenElementsOfSameType<User>();
        mixedList = addUser(mixedList, new User("User", ""));
        mixedList = addUser(mixedList, new Admin("Admin", ""));
        printUsers(mixedList);
    }

    private static void printUsers(UpToTenElementsOfSameType<? extends User> tenItems) {
        for (int i = 0; i < tenItems.getCount(); i++) {
            System.out.println(tenItems.get(i));
        }
    }

    private static UpToTenElementsOfSameType<User> addUser(
            UpToTenElementsOfSameType<? super User> userlist,
            User userToAdd) {
        if (userlist.getCount() < 10) {
            userlist.add(userToAdd);
        }

        return (UpToTenElementsOfSameType<User>) userlist;
    }
}
