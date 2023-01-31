package com.devToJu.Generics;

public class Main {
    public static void main(String[] args) {
        var numbers = new GenericList<Number>(5);
        numbers.add(1);
        numbers.add(33.3f);

        var users = new GenericList<User>(3);
        users.add(new User("schnuffy23", "bad_decision"));
        users.add(new User("test0815", "password1234"));

        System.out.println(users.get(0).getUsername());
        System.out.println(users.get(0).getPassword());

        var admins = new GenericList<Admin>(1);
        admins.add(new Admin("admin1", "admin1"));
        admins.get(0).foo();
    }
}
