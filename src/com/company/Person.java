package com.company;

import java.io.Serializable;

public class Person implements Serializable {
    private String name;
    private int dateOfBirth;
    private String address;

    public Person(String name, int dateOfBirth, String address)
    {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", address='" + address + '\'' +
                '}';
    }
}
