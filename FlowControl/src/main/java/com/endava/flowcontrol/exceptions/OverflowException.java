/**
 * This file is part of the Endava Graduates training program
 * Created by Calin Radu 22.07.2015
 */
package com.endava.flowcontrol.exceptions;

/**
 * Exception thrown when a value exceeds Integer.MAX_VALUE
 */
public class OverflowException extends Exception {
    public OverflowException(String message) {
        super(message);
    }
}
