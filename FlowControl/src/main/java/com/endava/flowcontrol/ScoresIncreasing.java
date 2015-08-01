/**
 * This file is part of the Endava Graduates training program
 * Created by Calin Radu 22.07.2015
 */
package com.endava.flowcontrol;

public class ScoresIncreasing {

    /**
     * @param scores an array of scores
     * @return true if the array is sorted ascending
     */
    public boolean scoresIncreasing(int[] scores) {
        for (int i = 1; i <= scores.length - 1; i++) {
            if (scores[i] < scores[i - 1]) {
                return false;
            }
        }
        return true;
    }
}
