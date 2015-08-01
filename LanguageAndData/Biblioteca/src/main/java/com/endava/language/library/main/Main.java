/**
 * This file is part of the Endava Graduates training program
 * Created by Calin Radu 20.07.2015
 */

package com.endava.language.library.main;

import com.endava.language.library.Book;

/**
 * Testing the functionality of the Book class
 */
public class Main {
    public static void main(String[] args) {
        Book firstBook = new Book("How to find variable names", "Radu Calin", "Java official", 420);
        Book secondBook = new Book("Still having troubles", "Calin Radu", "Java unofficial", 296);

        System.out.println(firstBook);
        System.out.println(secondBook);

        System.out.println("The thicker book is " + Book.comparePages(firstBook, secondBook));

        if (firstBook.compareTo(secondBook) == 1) {
            System.out.println("The books are the same");
        } else {
            System.out.println("These are 2 different books");
        }
    }
}
