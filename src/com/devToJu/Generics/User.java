package com.devToJu.Generics;

public class User implements Comparable<User>{
    private final String username;
    private final String password;
    private double hoursOnline;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
        this.hoursOnline = Math.random() * 18;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public double getHoursOnline() {
        return hoursOnline;
    }

    @Override
    public String toString() {
        return "User " + username;
    }

    @Override
    public int compareTo(User other) {
        if (getHoursOnline() > other.getHoursOnline())
            return 1;

        if (getHoursOnline() < other.getHoursOnline())
            return -1;

        return 0;
    }
}
