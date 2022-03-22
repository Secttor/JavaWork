package org.example_5;

/**
 * Main class to display results
 */

import java.util.*;

public class Main {
    /**
     * Method for removing by ID
     *
     * @param ID - parameter used for removing
     */
    public static Student removeByID(String ID, List<Student> myList) {
        for (Student s : myList) {
            if (s.getID().equals(ID)) return s;
        }
        throw new NoSuchElementException("ID is empty, student does not exist");
    }

    /**
     * Method for the age calculation based on ID
     */
    public static List<Student> getAge(List<Student> myList, int age) {
        List<Student> listtoreturn = new ArrayList<>();
        if (age <= 0) {
            throw new IllegalArgumentException("Age is not a number/is negative");
        }
        for (Student s : myList) {
            if (2022 - s.getDateOfBirth() == age) {
                listtoreturn.add(s);
            }
        }
        return listtoreturn;

    }

    public static Student checkFirstLastName(String FirstName, String LastName, List<Student> myList) {
        for (Student s : myList) {
            if (s.getFirstName().equals(FirstName) || s.getLastName().equals(LastName)) {
                return s;
            }
        }
        throw new NoSuchElementException("Student First or/and Last name are empty");
    }

    public static Student checkGender(String Gender, List<Student> myList) {
        for (Student s : myList) {
            if (s.getGender().equalsIgnoreCase("male") || s.getGender().equalsIgnoreCase("female")) {
                return s;
            }
        }
        throw new NoSuchElementException("Gender not recognized");
    }


    public static void main(String[] args) {
        //Adding student
        List<Student> myList = new ArrayList<>();
        myList.add(new Student("Kim", "Thomas", "male", 1980, "1800101415063"));
        myList.add(new Student("Raul", "Lord", "male", 1985, "18501034117342"));
        myList.add(new Student("Ryan", "Aston", "male", 1985, "1850103411791"));
        myList.add(new Student("Mary", "Ann", "female", 1990, "2900105417867"));

        //A.Listing all
        System.out.println("Listing all: ");
        for (Student s : myList) {
            System.out.println("Student FirstName - " + s.getFirstName() + " , LastName - " + s.getLastName() + " , Gender - " + s.getGender() + " , DateOfBirth - " + s.getDateOfBirth() + " & ID - " + s.getID());
        }

        //B.List students order by Last Name
        System.out.println("Students list ordered by Last Name: ");
        myList.sort(Comparator.comparing(Student::getLastName));
        for (Student s : myList) {
            System.out.println(s.toString());
        }

        //C.Remove student (by ID)
        // Change the ID to see the exception
        myList.remove(removeByID("1800101415063", myList));
        System.out.println("After removing by ID:1800101415063 ");
        for (Student s : myList) {
            System.out.println("Student FirstName - " + s.getFirstName() + " , LastName - " + s.getLastName() + " , Gender - " + s.getGender() + " , DateOfBirth - " + s.getDateOfBirth() + " & ID - " + s.getID());

        }

        //ID Conversion from String to Long
        for (Student ss : myList) {
            long s = Long.parseLong(ss.getID());
        }

        //D.Retrieve all students with Age X
        // Change the age to see the exception
        System.out.println("Retrieve with age 37: ");
        List<Student> age37 = getAge(myList, 37);
        for (Student s : age37) {
            System.out.println(s.toString());
        }

        //E.Verify Gender
        System.out.println("Gender verify");
        Student checkgender = checkGender("male", myList);
        for (Student s : myList) {
            System.out.println(s.toString());
        }
        //F.Verify Fist-Last Name String
        System.out.println("First-Last name check");

        Student checkname = checkFirstLastName("Kim", "Thomas", myList); //get the message because it was removed at point C. (with ID)
        for (Student s : myList) {
            System.out.println(s.toString());
        }
    }
}






