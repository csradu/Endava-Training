/**
 * This file is part of the Endava Graduates training program
 * Created by Calin Radu 27.07.2015
 */
package main.java.com.endava.io.counter;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CharacterCounter {

    private FileReader input = null;
    private final String fileName;

    CharacterCounter(String fileName) throws FileNotFoundException {
        this.fileName = fileName;
        input = new FileReader(new File(fileName));
    }

    CharacterCounter() throws FileNotFoundException {
        this("text.txt");
    }

    public int countCharacters(char c) throws IOException {
        int sum = 0;
        int read;

        while ((read = input.read()) != -1) {
            if ((char) read == c) {
                sum++;
            }
        }
        return sum;
    }

}
