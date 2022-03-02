package org.example_4;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        /**
         * Class to printout first names of persons and ages which were intially adeed to a TreeSet.
         * Have been used Comparable
         */
            Set<Person> setOfPersons = new TreeSet<>();
            setOfPersons.add(new Person("Kim", 24, new Adress("Belgium", "Europe", "Bruxelles", 220)));
            setOfPersons.add(new Person("Alan", 20, new Adress("Italy", "Europe", "Rome", 11)));
            setOfPersons.add(new Person("Tom", 11, new Adress("France", "Europe", "Paris", 12)));

            for (Person person : setOfPersons) {
                System.out.println(person);

            }
            System.out.println("===============");
            Person person1 = new Person("Kim", 24, new Adress("Belgium", "Europe", "Bruxelles", 220));
            Person person2 = new Person("Alan", 20, new Adress("Italy", "Europe", "Rome", 11));
            Person person3 = new Person("Tom", 11, new Adress("France", "Europe", "Paris", 12));

            System.out.println("Person name: " + person1.getName());
            System.out.println("Address: " + person1.adress.country + " " + person1.adress.city + " " + person1.adress.region + " " + person1.adress.postalcode);

            System.out.println("Person name: " + person2.getName());
            System.out.println("Address: " + person2.adress.country + " " + person2.adress.city + " " + person2.adress.region + " " + person2.adress.postalcode);

            System.out.println("Person name: " + person3.getName());
            System.out.println("Address: " + person2.adress.country + " " + person2.adress.city + " " + person2.adress.region + " " + person2.adress.postalcode);

            Map<Person, Adress> Adresses = new HashMap<>();

        }
    }


