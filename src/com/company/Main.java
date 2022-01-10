package com.company;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Person person1 = new Person("Leonid", 2001, "Mozhaiskaya 20");
        Person person2 = new Person("Egor", 2001, "Mozhaiskaya 20");
        Person person3 = new Person("Nikita", 2001, "Mozhaiskaya 20");
        Person person4 = new Person("Lesha", 2001, "Mozhaiskaya 20");
        List<Person> personList = new ArrayList<Person>();
        personList.add(person1);
        personList.add(person2);
        personList.add(person3);
        personList.add(person4);

        Persons persons = new Persons(personList);

        persons.writeFile("C:\\Users\\lenya\\IdeaProjects\\ser\\persons.out");

        persons.readFile("C:\\Users\\lenya\\IdeaProjects\\ser\\persons.out");



    }
}
