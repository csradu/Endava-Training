/**
 * This file is part of the Endava Graduates training program
 * Created by Calin Radu 7/29/2015
 */
package main.java.com.endava.threads.words.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;

public class CustomFileWriter {

    private PrintStream writer;

    public CustomFileWriter(String fileName) throws FileNotFoundException {
        writer = new PrintStream(new File(fileName));
    }

    /**
     * Writes the results in a hashMap to a file
     *
     * @param results
     * @throws IOException
     */
    public void writeFile(HashMap<String, Float> results) throws IOException {
        for (Map.Entry<String, Float> entry : results.entrySet()) {
            writer.printf("%s %.2f", entry.getKey(), entry.getValue());
            writer.println("%");
        }
        writer.close();
    }

}
