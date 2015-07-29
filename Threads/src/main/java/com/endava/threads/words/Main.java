/**
 * This file is part of the Endava Graduates training program
 * Created by Calin Radu 28.07.2015
 */
package main.java.com.endava.threads.words;

import main.java.com.endava.threads.words.file.CustomFileReader;
import main.java.com.endava.threads.words.file.CustomFileWriter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static final int THREAD_NUMBER = 2;
    private static HashMap<String, Integer> results = new HashMap<>();

    /**
     * Reads file, creates threads for processing data and writes results to file
     *
     * @param args
     */
    public static void main(String[] args) {
        try {
            ArrayList<Thread> threadList = new ArrayList();
            ArrayList<String> words = new ArrayList();
            CustomFileReader customReader = new CustomFileReader("words.txt");
            CustomFileWriter customWriter = new CustomFileWriter("results.txt");
            words = customReader.readFile();

            for (int i = 0; i < THREAD_NUMBER; i++) {
                WordsPercentage currentThread = new WordsPercentage(words, i);
                Thread thread = new Thread(currentThread);
                threadList.add(thread);
                thread.start();
            }
            for (int i = 0; i < THREAD_NUMBER; i++) {
                threadList.get(i).join();
            }
            HashMap<String, Float> percentages = percentageMap(results, words.size());
            customWriter.writeFile(percentages);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static synchronized void addWord(String word) {
        if (results.containsKey(word)) {
            int newValue = results.get(word) + 1;
            results.put(word, newValue);
        } else {
            results.put(word, 1);
        }
    }

    private static HashMap<String, Float> percentageMap(HashMap<String, Integer> wordsMap, int numberOfWords) {
        HashMap<String, Float> percentageMap = new HashMap();
        for (Map.Entry<String, Integer> entry : wordsMap.entrySet()) {
            float percentage = (float) entry.getValue() / (float) numberOfWords * 100;
            percentageMap.put(entry.getKey(), percentage);
        }
        return percentageMap;
    }
}
