/**
 * This file is part of the Endava Graduates training program
 * Created by Calin Radu 28.07.2015
 */
package com.endava.threads.words;

import java.util.List;

public class WordsPercentage implements Runnable {

    private List<String> wordsList;
    private int threadNumber;

    public WordsPercentage(List<String> wordsList, int threadNumber) {
        this.wordsList = wordsList;
        this.threadNumber = threadNumber;
    }

    public void run() {
        int endIndex;
        int startIndex;
        startIndex = (wordsList.size() / Main.THREAD_NUMBER) * threadNumber;
        if (threadNumber + 1 == Main.THREAD_NUMBER) {
            endIndex = wordsList.size();
        } else {
            endIndex = (wordsList.size() / Main.THREAD_NUMBER) * (threadNumber + 1);
        }
        for (int i = startIndex; i < endIndex; i++) {
            Main.addWord(wordsList.get(i));
        }
    }
}
