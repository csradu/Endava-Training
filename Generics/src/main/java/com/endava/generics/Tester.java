/**
 * This file is part of the Endava Graduates training program
 * Created by Calin Radu 23.07.2015
 */
package com.endava.generics;

import com.endava.generics.exceptions.EmptyListException;

import java.util.*;


public class Tester<T> {

    //The list of bugs
    private List<T> bugs;

    public Tester() {
        bugs = new ArrayList();
    }

    public Tester(T[] elements) {
        bugs = new ArrayList<T>(Arrays.asList(elements));
    }

    public void addBug(T newBug) {
        bugs.add(newBug);
    }

    //Returns the last bug added or an exception if the list is empty
    public T getLastBug() throws EmptyListException {
        if (bugs.size() != 0) {
            return bugs.get(bugs.size() - 1);
        }
        throw new EmptyListException("The list is empty!");
    }

    public static void main(String[] args) {
        try {
            //Creating the Bug lists
            Tester<Integer> integers = new Tester(new Integer[]{2, 9, 22, 45});
            Tester<Float> floats = new Tester();
            floats.addBug(22.4f);
            floats.addBug(49.6f);

            //Printing the results
            System.out.println(integers.getLastBug());
            System.out.println(floats.getLastBug());

        } catch (EmptyListException e) {
            System.out.println(e.getMessage());
        }
    }
}
