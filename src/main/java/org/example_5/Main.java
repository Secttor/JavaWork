package org.example_5;

/**
 * Main class to display results
 */

import java.util.ArrayList;
import java.util.List;

public class Main {
    /**
     * Method for removing by ID
     * @param ID - parameter used for removing
     */
    public static Student rremoveByID(String ID, List<Student> myList) {
        for (Student s : myList) {
            if (s.getID().equals(ID)) return s;
        }
        return null;
    }
    /**
     * Method for the age calculation based on ID
     */
    public static List<Student> getAge(List<Student> myList, int age) {
        List<Student> listtoreturn = new ArrayList<>();
        for (Student s : myList) {
            if (2022 - s.getDateOfBirth() == age) {
                listtoreturn.add(s);
            }
        }
        return listtoreturn;
    }

    public static void main(String[] args) {
        //Adding student
        List<Student> myList = new ArrayList<>();
        myList.add(new Student("Kim", "Thomas", "male", 1980, "1800101415063"));
        myList.add(new Student("Ryan", "Aston", "male", 1985, "1850103411791"));
        myList.add(new Student("Mary", "Ann", "female", 1990, "2900105417867"));

        //Listing all
        System.out.println("Listing all: ");
        for (Student s : myList) {
            System.out.println("Student FirstName - " + s.getFirstName() + " + LastName - " + s.getLastName() + " + Gender - " + s.getGender() + " + DateOfBirth - " + s.getDateOfBirth() + " & ID - " + s.getID());
        }

        myList.remove(rremoveByID("1800101415063", myList));
        //Delete student (by ID)
        System.out.println("After removing ID: ");
        for (Student s : myList) {
            System.out.println("Student FirstName - " + s.getFirstName() + " + LastName - " + s.getLastName() + " + Gender - " + s.getGender() + " + DateOfBirth - " + s.getDateOfBirth() + " & ID - " + s.getID());

        }

        //ID Conversion from String to Long
        for (Student ss : myList) {
            long s = Long.parseLong(ss.getID());
        }

        //Retrieve all students with Age X
        System.out.println("With age 37: ");
        List<Student> age32 = getAge(myList,37);
        for (Student s : age32){
            System.out.println(s.toString());
        }

        //List students order by Last Name or Birth Date

    }
}





