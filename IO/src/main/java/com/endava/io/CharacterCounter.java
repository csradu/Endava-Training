package main.java.com.endava.io;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class CharacterCounter {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader(new File("text.txt"));
            int c;
            int s = 0;
            while((c = fr.read()) != -1) {
                if((char) c == 'a') {
                    s++;
                }
            }
            System.out.println(s);
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
