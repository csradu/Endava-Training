/**
 * This file is part of the Endava Graduates training program
 * Created by Calin Radu 8/4/2015
 */
package com.endava.spring.jdbc.country;

import org.hamcrest.CoreMatchers;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsNull.notNullValue;

import javax.sql.DataSource;

public class CountryTestCase {

    private CountryJDBCTemplate countryJDBCTemplate;
    private DataSource dataSource;
    private JdbcTemplate jdbcTemplate;

    @Before
    public void setUp() {
        ApplicationContext context = new ClassPathXmlApplicationContext("database-test-config.xml");
        dataSource = context.getBean("dataSource", DataSource.class);
        jdbcTemplate = new JdbcTemplate(dataSource);
        countryJDBCTemplate = new CountryJDBCTemplate();
    }

    @Test
    public void testInsert() {
        countryJDBCTemplate.create(new Country(1, "TestCountry"));

        String sql = "select * from countries where id = ?";
        Country country = jdbcTemplate.queryForObject(sql, new Object[]{1}, new CountryMapper());

        assertThat(country, is(notNullValue()));
        assertThat(country.getId(), is(1));
        assertThat(country.getName(), is("TestCountry"));
    }

}
