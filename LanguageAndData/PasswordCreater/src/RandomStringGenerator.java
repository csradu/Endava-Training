/**
 * This file is part of the Endava Graduates training program
 * Created by Calin Radu 20.07.2015
 */

import java.util.Random;

public class RandomStringGenerator {

    //generator alphabet
    private char[] alphabet;

    //generator length
    private int length;

    RandomStringGenerator(int length, String alphabet) {
        this.length = length;
        this.alphabet = alphabet.toCharArray();
    }

    /**
     * Creates a random generated String with characters from the specified alphabet
     * and having the specified length
     * @return a random generated String
     */
    public String next() {
        String result = "";
        int value;
        Random generator = new Random();

        for (int i = 0; i < length; i++) {
            value = generator.nextInt(length - 1);
            result += alphabet[value];
        }
        return result;
    }
}
