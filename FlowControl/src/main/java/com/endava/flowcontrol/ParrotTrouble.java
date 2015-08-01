/**
 * This file is part of the Endava Graduates training program
 * Created by Calin Radu 22.07.2015
 */
package com.endava.flowcontrol;

/**
 * Class for testing if the parrot's actions create trouble
 */
public class ParrotTrouble {

    public boolean parrotTrouble(boolean talking, int hour) {
        return (hour < 7 || hour > 20) ? talking : false;
    }
}
