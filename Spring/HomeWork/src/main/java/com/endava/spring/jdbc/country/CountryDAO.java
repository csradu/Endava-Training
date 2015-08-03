package com.endava.spring.jdbc.country;

import javax.sql.DataSource;
import java.util.List;

public interface CountryDAO {

    public void setDataSource(DataSource dataSource);

    /**
     * Create a record in the Country table
     */
    public void create(Country c);

    /**
     * Get a record having the specified id from the Country table
     */
    public Country getCountry(int id);

    /**
     * Get all the countries in the Country table
     */
    public List<Country> listCountries();

    /**
     * Delete a record from the Country table identified by the id
     */
    public void delete(int id);

    /**
     * Change the name of a record in the Country table
     */
    public void update(int id, String name);

}
