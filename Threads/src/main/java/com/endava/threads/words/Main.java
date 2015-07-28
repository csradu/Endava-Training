/**
 * This file is part of the Endava Graduates training program
 * Created by Calin Radu 28.07.2015
 */
package main.java.com.endava.threads.words;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static final int THREAD_NUMBER = 2;
    private static HashMap<String, Integer> results = new HashMap<>();

    public static synchronized void addWord(String word) {
        if (results.containsKey(word)) {
            int newValue = results.get(word) + 1;
            results.put(word, newValue);
        } else {
            results.put(word, 1);
        }
    }

    /**
     * Reads file, creates threads for processing data and writes results to file
     *
     * @param args
     */
    public static void main(String[] args) {
        try {
            ArrayList<Thread> threadList = new ArrayList();
            ArrayList<String> words = new ArrayList();
            words = readFile("words.txt");

            for (int i = 0; i < THREAD_NUMBER; i++) {
                WordsPercentage currentThread = new WordsPercentage(words, i);
                Thread thread = new Thread(currentThread);
                threadList.add(thread);
                thread.start();
            }
            for (int i = 0; i < THREAD_NUMBER; i++) {
                threadList.get(i).join();
            }
            writeFile("results.txt", words);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /**
     * Reads all the words from a file and adds them to an ArrayList
     *
     * @param fileName the path to the file
     * @return an ArrayList with words from the file
     * @throws IOException
     */
    private static ArrayList<String> readFile(String fileName) throws IOException {
        FileReader readWords = new FileReader(new File(fileName));
        BufferedReader reader = new BufferedReader(readWords);
        ArrayList<String> wordsList = new ArrayList();
        String line = "";
        while ((line = reader.readLine()) != null) {
            String[] words = line.split(" ");
            for (int i = 0; i < words.length; i++) {
                wordsList.add(words[i]);
            }
        }
        return wordsList;

    }

    /**
     * Writes a the words and their percentages to a specified file
     *
     * @param fileName the file to where the words are written
     * @param words    list of words
     * @throws IOException
     */
    private static void writeFile(String fileName, ArrayList<String> words) throws IOException {
        PrintStream writeWords = new PrintStream(new File(fileName));
        for (Map.Entry<String, Integer> entry : results.entrySet()) {
            float percentage = (float) entry.getValue() / (float) words.size() * 100;
            writeWords.printf("%s %.2f", entry.getKey(), percentage);
            writeWords.println("%");
        }
        writeWords.close();
    }
}
