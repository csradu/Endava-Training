
/**
 * This file is part of the Endava Graduates training program
 * Created by Calin Radu 24.07.2015
 */
package com.endava.collections.person;

import java.util.HashMap;
import java.util.Iterator;

/**
 * Class for implementing the functionality of Person
 */
public class PersonOperations {

    private final HashMap<String, Person> personHashMap;

    public PersonOperations(HashMap<String, Person> personHashMap) {
        this.personHashMap = personHashMap;
    }

    public Person getPerson(String name) {
        return personHashMap.get(name);
    }

    public void addPerson(Person p) {
        personHashMap.put(p.getName(), p);
    }

    public boolean removePerson(String name) {
        return personHashMap.remove(name) != null;
    }

    public boolean containsPerson(String name) {
        return personHashMap.containsKey(name);
    }

    public void printUsingKeys() {
        Iterator i = personHashMap.keySet().iterator();
        while (i.hasNext()) {
            System.out.println(personHashMap.get(i.next()));
        }
    }

    public void printUsingValues() {
        Iterator i = personHashMap.values().iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }


}
