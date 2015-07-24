/**
 * This file is part of the Endava Graduates training program
 * Created by Calin Radu 24.07.2015
 */
package main.java.com.endava.tvseries;

import main.java.com.endava.tvseries.exceptions.InvalidDateException;

import java.util.ArrayList;
import java.util.HashMap;
import java.io.*;
import java.util.HashSet;
import java.util.Map;

/**
 * Class for the functionality of Programs and TV Series
 */
public class Program {

    private String fileName;
    //Map having tv programs as keys and a list of TV Series as value
    private Map<String, ArrayList<TVSeries>> programMap;

    public Program(String fileName) {
        this.fileName = fileName;
        programMap = new HashMap<>();
    }

    public Program() {
        this("info.txt");
    }

    /**
     * Reads lines from the specified text document, creates TVSeries objects
     * and adds them to the HashMap
     *
     * @throws FileNotFoundException
     * @throws IOException
     */
    public void populate() throws FileNotFoundException, IOException {
        File program = new File(fileName);
        BufferedReader programReader = new BufferedReader(new FileReader(program));
        String seriesLine;

        while ((seriesLine = programReader.readLine()) != null) {
            try {
                String[] seriesProp = seriesLine.split("-");
                TVSeries series = new TVSeries(seriesProp[1], seriesProp[2], seriesProp[3], seriesProp[4], seriesProp[5]);
                if (programMap.containsKey(seriesProp[0])) {
                    programMap.get(seriesProp[0]).add(series);
                } else {
                    programMap.put(seriesProp[0], new ArrayList());
                    programMap.get(seriesProp[0]).add(series);
                }
            } catch (InvalidDateException e) {

            }
        }
    }

    /**
     * Shows all the TV Series that run on this TV Program
     *
     * @param tvProgram name of the TV program
     */
    public void printProgram(String tvProgram) {
        System.out.println("List of main.java.com.endava.tvseries.TVSeries for " + tvProgram + ":");
        ArrayList<TVSeries> series = programMap.get(tvProgram);
        for (TVSeries s : series) {
            System.out.println("\t" + s);
        }
        System.out.println("---------------------------");
    }

    /**
     * Prints informations about a specified TV Series
     *
     * @param tvSeries
     */
    public void printSeriesInfo(String tvSeries) {
        it:
        for (ArrayList<TVSeries> tvProgram : programMap.values()) {
            for (TVSeries series : tvProgram) {
                if (series.getSeriesName().equals(tvSeries)) {
                    System.out.println("Series info for " + tvSeries + ":\n\t" + series);
                    break it;
                }
            }
        }
        System.out.println("---------------------------");
    }

    /**
     * Prints all airing dates for a specified TV Series
     *
     * @param tvSeries
     */
    public void printDates(String tvSeries) {
        System.out.println("Airing dates for " + tvSeries);
        for (Map.Entry<String, ArrayList<TVSeries>> entry : programMap.entrySet()) {
            for (TVSeries series : entry.getValue()) {
                if (series.getSeriesName().equals(tvSeries)) {
                    System.out.println("\t" + entry.getKey() + "-" + series.getAirDay() + "-" + series.getAirHour());
                }
            }
        }
        System.out.println("---------------------------");
    }

    /**
     * Prints all the TV Series that are of the specified type
     *
     * @param type
     */
    public void printTypeSeries(String type) {
        HashSet<TVSeries> seriesSet = new HashSet();
        System.out.println("Series for the type " + type + ":");
        for (ArrayList<TVSeries> seriesList : programMap.values()) {
            for (TVSeries tvSeries : seriesList) {
                if (tvSeries.getType().equals(type)) {
                    seriesSet.add(tvSeries);
                }
            }
        }
        for (TVSeries s : seriesSet) {
            System.out.println("\t" + s);
        }
        System.out.println("---------------------------");
    }

    /**
     * Updates the day and hour of a specified TV series running on a specified TV program
     *
     * @param tvSeries
     * @param tvProgram
     * @param newDay
     * @param newHour
     */
    public void updateAirDate(String tvSeries, String tvProgram, String newDay, String newHour) {
        for (TVSeries series : programMap.get(tvProgram)) {
            if (series.getSeriesName().equals(tvSeries)) {
                series.updateAirDate(newDay, newHour);
            }
        }
        System.out.println("Updated air date for " + tvSeries + " to:\n\t" + tvProgram +
                "-" + newDay + "-" + newHour);
        System.out.println("---------------------------");
    }

}
