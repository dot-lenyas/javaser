package com.company;

import java.io.*;

public class ReadFile {
    public ReadFile(String path) throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream(path);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        Person person = (Person) objectInputStream.readObject();

        System.out.println(person);
    }
}