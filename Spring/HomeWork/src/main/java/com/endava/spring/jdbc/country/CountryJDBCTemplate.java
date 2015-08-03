/**
 * This file is part of the Endava Graduates training program
 * Created by Calin Radu 8/3/2015
 */
package com.endava.spring.jdbc.country;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.util.List;

@Component
public class CountryJDBCTemplate implements CountryDAO {

    private DataSource dataSource;
    private JdbcTemplate jdbcTemplate;

    @Autowired
    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public synchronized void create(Country c) {
        String sql = "INSERT INTO COUNTRIES values(?, ?)";
        jdbcTemplate.update(sql, new Object[]{c.getId(), c.getName()});
    }

    public Country getCountry(int id) {
        String sql = "select * from countries where ID = ?";
        return jdbcTemplate.queryForObject(sql, new Object[]{id}, new CountryMapper());
    }

    public List<Country> listCountries() {
        String sql = "select * from countries";
        return jdbcTemplate.query(sql, new CountryMapper());
    }

    public void delete(int id) {
        String sql = "DELETE FROM COUNTRIES WHERE ID = ?";
        jdbcTemplate.update(sql, new Object[]{id});
    }

    public void update(int id, String name) {
        String sql = "UPDATE COUNTRIES SET NAME = ? WHERE ID = ?";
        jdbcTemplate.update(sql, new Object[]{id, name});
    }
}
