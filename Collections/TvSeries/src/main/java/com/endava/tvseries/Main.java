/**
 * This file is part of the Endava Graduates training program
 * Created by Calin Radu 24.07.2015
 */
package main.java.com.endava.tvseries;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Class for testing functionality of main.java.com.endava.tvseries.Program and main.java.com.endava.tvseries.TVSeries
 */
public class Main {
    public static void main(String[] args) {
        Program p = new Program();
        try {
            p.populate();
            p.printProgram("PRO TV");
            p.printSeriesInfo("Penny Dreadful");
            p.printDates("Homeland");
            p.updateAirDate("Homeland", "PRO TV", "Monday", "21:11");
            p.printDates("Homeland");
            p.printTypeSeries("Comedy");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
