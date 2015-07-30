/**
 * This file is part of the Endava Graduates training program
 * Created by Calin Radu 7/30/2015
 */
package com.endava.graduates.trainings.file;

import java.io.FileNotFoundException;

public class StubFileRead implements FileReadInterface{
    public String readFromFile() throws FileNotFoundException {
        return "test";
    }
}
