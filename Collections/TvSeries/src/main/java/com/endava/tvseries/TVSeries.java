/**
 * This file is part of the Endava Graduates training program
 * Created by Calin Radu 24.07.2015
 */
package main.java.com.endava.tvseries;

import main.java.com.endava.tvseries.exceptions.InvalidDateException;

/**
 * Class representing a TV Series object
 */
public class TVSeries {

    private final String seriesName;
    private String airDay;
    private String airHour;
    private String productionYear;
    private String type;

    public TVSeries(String seriesName, String airDay, String airHour, String productionYear,
                    String type) throws InvalidDateException {
        if (validateDay(airDay) && validateHour(airHour)) {
            this.seriesName = seriesName;
            this.airDay = airDay;
            this.airHour = airHour;
            this.productionYear = productionYear;
            this.type = type;
        } else {
            throw new InvalidDateException("Invalid air date for " + airDay + " " + airHour);
        }
    }


    private boolean validateHour(String airHour) {
        //Verifies if the hour is valid
        return true;
    }

    private boolean validateDay(String airDay) {
        //Verifies if the date is valid
        return true;
    }

    public String getAirDay() {
        return airDay;
    }

    public String getAirHour() {
        return airHour;
    }

    public String getSeriesName() {
        return seriesName;
    }

    public String getType() {
        return type;
    }

    public String toString() {
        return "Series name: " + seriesName + " Production year: " + productionYear + " Type: " + type;
    }

    public void setAirDay(String airDay) {
        this.airDay = airDay;
    }

    public void setAirHour(String airHour) {
        this.airHour = airHour;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TVSeries tvSeries = (TVSeries) o;

        if (seriesName != null ? !seriesName.equals(tvSeries.seriesName) : tvSeries.seriesName != null) return false;
        if (productionYear != null ? !productionYear.equals(tvSeries.productionYear) : tvSeries.productionYear != null)
            return false;
        return !(type != null ? !type.equals(tvSeries.type) : tvSeries.type != null);

    }

    @Override
    public int hashCode() {
        int result = seriesName != null ? seriesName.hashCode() : 0;
        result = 31 * result + (productionYear != null ? productionYear.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        return result;
    }

    public void updateAirDate(String newDay, String newHour) {
        setAirDay(newDay);
        setAirHour(newHour);
    }
}
