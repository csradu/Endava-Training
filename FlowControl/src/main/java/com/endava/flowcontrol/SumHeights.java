/**
 * This file is part of the Endava Graduates training program
 * Created by Calin Radu 22.07.2015
 */
package com.endava.flowcontrol;

public class SumHeights {

    /**
     * @param heights an array of heights
     * @param start   the start index
     * @param end     the end index
     * @return The sum of all altitude differences
     */
    public int sumHeights(int[] heights, int start, int end) {
        int sum = 0;
        for (int i = start + 1; i <= end; i++) {
            sum += Math.abs(heights[i] - heights[i - 1]);
        }
        return sum;
    }
}
