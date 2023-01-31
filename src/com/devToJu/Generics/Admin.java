package com.devToJu.Generics;

public class Admin extends User {
    public Admin(String username, String password) {
        super(username, password);
    }

    public void foo(){
        System.out.println("Do some Admin stuff...");
    }
}
