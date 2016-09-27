package com.example.bigapewhat.daggersample.Model;

/**
 * Created by Bigapewhat on 9/22/16.
 */

public class UserModel {
    private final String firstName;
    private final String lastName;

    public UserModel(String first, String last) {
        firstName = first;
        lastName = last;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName;
    }
}
