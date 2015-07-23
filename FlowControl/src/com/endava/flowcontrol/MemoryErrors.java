/**
 * This file is part of the Endava Graduates training program
 * Created by Calin Radu 22.07.2015
 */
package com.endava.flowcontrol;

public class MemoryErrors {

    /**
     * Throws OutOfMemoryError
     */
    public void outOfMem() {
        throw new OutOfMemoryError();
    }

    /**
     * Throws StackOverflowError
     */
    public void stackOverFlow() {
        throw new StackOverflowError();
    }
}
