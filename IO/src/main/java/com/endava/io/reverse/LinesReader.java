/**
 * This file is part of the Endava Graduates training program
 * Created by Calin Radu 27.07.2015
 */
package main.java.com.endava.io.reverse;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;

public class LinesReader {

    private String fileName;
    private LinkedList<String> stringList = new LinkedList();
    private BufferedReader reader;

    public LinesReader(String fileName) throws IOException {
        this.fileName = fileName;
        reader = new BufferedReader(new FileReader(new File(fileName)));
    }

    public LinesReader() throws IOException {
        this("linii.txt");
    }

    public void readFile() throws IOException {
        String line;
        while ((line = reader.readLine()) != null) {
            stringList.add(line);
        }
    }

    public void printReverse() {
        Iterator it = stringList.descendingIterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

}
