/**
 * This file is part of the Endava Graduates training program
 * Created by Calin Radu 22.07.2015
 */
package com.endava.flowcontrol.exceptions;

/**
 * Exception thrown when a value is lower than Integer.MIN_VALUE
 */
public class UnderflowException extends Exception {
    public UnderflowException(String message) {
        super(message);
    }
}
