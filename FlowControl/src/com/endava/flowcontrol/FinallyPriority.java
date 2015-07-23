/**
 * This file is part of the Endava Graduates training program
 * Created by Calin Radu 22.07.2015
 */
package com.endava.flowcontrol;

public class FinallyPriority {

    /**
     * Method to test the priority of the "finally" block
     *
     * @return a test String
     */
    public String returnFinally() {
        try {
            return "test";
        } finally {
            System.out.println("You can't ignore me!");
        }
    }
}
