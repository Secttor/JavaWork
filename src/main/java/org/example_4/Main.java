package org.example_4;

import java.util.*;

/**
 * Main class to printout names of persons and ages which were intially adeed to a TreeSet.
 * Have been used Comparable in Person class
 * Also used for a certain Person, print the name of the hobby and the adress where it can be practiced
 */
public class Main {
    public static void main(String[] args) {

        Set<Person> setOfPerson = new TreeSet<>();
        setOfPerson.add(new Person("Kim", 24));
        setOfPerson.add(new Person("Alan", 20));
        setOfPerson.add(new Person("Tom", 11));

        for (Person person : setOfPerson) {
            System.out.println(person);

        }
        System.out.println("===============");

        Adress address1 = new Adress("Belgium", "Europe", "Bruxelles", 12);
        Adress address2 = new Adress("France", "Europe", "Lyon", 1234);
        Adress address3 = new Adress("Germany", "Europe", "Frankfurt", 8475);

        Hobby swimming = new Hobby("swiming", 5, address1);
        Hobby surfing = new Hobby("surfing", 3, address2);
        Hobby running = new Hobby("running", 3, address3);

        Set<Person> setOfPersons = new TreeSet<>();
        setOfPersons.add(new Person("Alan", 20) {{
            hobbies.add(swimming);
            hobbies.add(running);
        }});
        setOfPersons.add(new Person("Tom", 11) {{
            hobbies.add(swimming);
            hobbies.add(surfing);
        }});

        // Fill hash map
        HashMap<Person, List<Hobby>> map = new HashMap<>();
        for (Person person : setOfPersons)
            map.put(person, person.hobbies);

        // Iterate this map
        for (Map.Entry<Person, List<Hobby>> entry : map.entrySet()) {
            Person person = entry.getKey();
            List<Hobby> hobbies = entry.getValue();

            for (Hobby hobby : hobbies)
                System.out.println(person.getName() + " have a hobby: " + hobby.name + " at the following " + hobby.adress);
        }
    }
}





