package com.company;

import java.io.*;
import java.util.List;

public class Persons implements Serializable {
    private List<Person> people;
    public Persons(List<Person> people)
    {
        this.people = people;
    }

    void writeFile(String path) throws IOException
    {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path, false));
        for (int i = 0; i < people.size(); i++)
        {
            oos.writeObject(people.get(i));
        }
    }

    void readFile(String path) throws ClassNotFoundException, IOException
    {
        ObjectInputStream ois =  new ObjectInputStream(new FileInputStream(path));
        for (int i = 0; i < people.size(); i++)
        {
            Person p = (Person) ois.readObject();
            System.out.println(p);
        }
    }


}
