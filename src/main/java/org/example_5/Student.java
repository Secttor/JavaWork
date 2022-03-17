package org.example_5;

import java.util.Objects;

/**
 * Student class for properties & constructor
 */

public class Student {
    String FirstName, LastName, Gender;
    int DateOfBirth;
    String ID;

    public Student(String FirstName, String LastName, String Gender, int DateOfBirth, String ID) {     //constructor
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.Gender = Gender;
        this.DateOfBirth = DateOfBirth;
        this.ID = ID;
    }


    public String getFirstName() {
        return FirstName;
    }


    public String getLastName() {
        return LastName;
    }


    public String getGender() {
        return Gender;
    }


    public int getDateOfBirth() {
        return DateOfBirth;
    }

    public String getID() {
        return ID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return DateOfBirth == student.DateOfBirth && ID == student.ID && FirstName.equals(student.FirstName) && LastName.equals(student.LastName) && Gender.equals(student.Gender);
    }

    @Override
    public int hashCode() {
        return Objects.hash(FirstName, LastName, Gender, DateOfBirth, ID);
    }

    @Override
    public String toString() {
        return
                "Student FirstName - " + FirstName + " + LastName - " + LastName + " + Gender - " + Gender + " + DateOfBirth - " + DateOfBirth + " & ID - " + ID;

    }
}


