/**
 * This file is part of the Endava Graduates training program
 * Created by Calin Radu 7/29/2015
 */
package com.endava.threads.words.file;

import java.io.*;
import java.util.ArrayList;

public class CustomFileReader {

    private BufferedReader reader;

    public CustomFileReader(String fileName) throws FileNotFoundException {
        reader = new BufferedReader(new FileReader(new File(fileName)));
    }

    /**
     * Reads all the words from a file and adds them to an ArrayList
     *
     * @return an ArrayList with words from the file
     * @throws IOException
     */
    public ArrayList<String> readFile() throws IOException {
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
}
