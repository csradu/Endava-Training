/**
 * This file is part of the Endava Graduates training program
 * Created by Calin Radu 23.07.2015
 */
package com.endava.generics.exceptions;

/**
 * Exception to indicate that a list is empty
 */
public class EmptyListException extends Exception {
    public EmptyListException(String message) {
        super(message);
    }
}
