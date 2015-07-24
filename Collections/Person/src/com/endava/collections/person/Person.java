/**
 * This file is part of the Endava Graduates training program
 * Created by Calin Radu 24.07.2015
 */

package com.endava.collections.person;

/**
 * Class for representing a person
 */
public class Person {

    private final String name;
    private final int yearOfBirth;

    public Person(String name, int yearOfBirth) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
    }

    @Override
    public String toString() {
        return "Name: " + name + " \tYear of birth: " + yearOfBirth;
    }

    public String getName() {
        return name;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }
}
