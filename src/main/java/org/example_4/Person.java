package org.example_4;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Person implements Comparable<Person>{
    private String name;
    private int age;
    Adress adress;


    private Map<String, Person> rude = new HashMap<>();

    public Person(String name, int age, Adress adress) {
        this.name = name;
        this.age = age;
        this.adress = adress;

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<String, Person> getRude() {
        return rude;
    }

    @Override
    public String toString() {
        return "Person name: " + name + " & " + "age " + age;

    }

    //implement equal & hashcode (mai rapid decat equals)
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return name.equals(person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public int compareTo(Person o) {
        return this.name.compareTo(o.name);
    }



}








