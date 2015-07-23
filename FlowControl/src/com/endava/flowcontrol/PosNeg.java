/**
 * This file is part of the Endava Graduates training program
 * Created by Calin Radu 22.07.2015
 */
package com.endava.flowcontrol;

public class PosNeg {

    /**
     * Checks the sign correlation between a and b
     *
     * @param negative indicates if both a and b have to be negative in order to return true
     * @return true if a and b have different signs or if negative is true and both a and b are negative
     */
    public boolean posNeg(int a, int b, boolean negative) {
        if (negative) {
            return (a < 0 && b < 0);
        } else {
            return (a < 0 && b >= 0) || (b < 0 && a >= 0);
        }
    }
}
