/**
 * This file is part of the Endava Graduates training program
 * Created by Calin Radu 8/3/2015
 */
package com.endava.spring.jdbc.country;


import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CountryMapper implements RowMapper<Country> {

    @Override
    public Country mapRow(ResultSet resultSet, int i) throws SQLException {
        Country country = new Country();
        country.setId(resultSet.getInt("id"));
        country.setName(resultSet.getString("name"));
        return country;
    }
}
