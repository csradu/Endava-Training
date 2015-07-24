/**
 * This file is part of the Endava Graduates training program
 * Created by Calin Radu 24.07.2015
 */

package com.endava.collections;

import com.endava.collections.person.Person;
import com.endava.collections.person.PersonOperations;

import java.util.HashMap;

/**
 * Test class for the functionality of Person
 */
public class Main {

    public static void main(String[] args) {

        HashMap<String, Person> personMap = new HashMap<>();
        PersonOperations po = new PersonOperations(personMap);

        Person person1 = new Person("Mihai", 1959);
        Person person2 = new Person("Andrei", 1966);
        Person person3 = new Person("Liviu", 1999);
        Person person4 = new Person("Silvia", 1988);

        po.addPerson(person1);
        po.addPerson(person2);
        po.addPerson(person3);
        po.addPerson(person4);

        System.out.println("Testing if 'Mihai' is a valid key, result " + po.containsPerson("Mihai"));
        System.out.println("-----------------------------------------");
        System.out.println("Getting the person with the key 'Liviu', result: " + po.getPerson("Liviu"));
        System.out.println("-----------------------------------------");
        System.out.println("Trying to remove 'Andrei' from the map, result: " + po.removePerson("Andrei"));
        System.out.println("-----------------------------------------");
        System.out.println("Printing the map using keys iterator: ");
        po.printUsingKeys();
        System.out.println("-----------------------------------------");
        System.out.println("Printing the map using values iterator: ");
        po.printUsingValues();


    }

}
