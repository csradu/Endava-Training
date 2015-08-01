/**
 * This file is part of the Endava Graduates training program
 * Created by Calin Radu 22.07.2015
 */
package com.endava.flowcontrol;

public class BackAround {

    /**
     * Adds the last character of a string at both its ends and returns it
     */
    public String backAround(String str) {
        String backAroundStr = null;
        if(str != null) {
            char lastChar = str.charAt(str.length() - 1);
            backAroundStr = lastChar + str + lastChar;
        }
        return backAroundStr;
    }
}
