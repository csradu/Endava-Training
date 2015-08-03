/**
 * This file is part of the Endava Graduates training program
 * Created by Calin Radu 8/3/2015
 */
package com.endava.spring.jdbc.employee;

import com.endava.spring.jdbc.country.Country;
import com.endava.spring.jdbc.job.Job;
import com.endava.spring.jdbc.dbconnector.DBConnectorImpl;
import com.endava.spring.jdbc.main.Main;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeMapper implements RowMapper<Employee> {

    public Employee mapRow(ResultSet resultSet, int i) throws SQLException {
        Employee employee = new Employee();
        Country country = null;
        Job job = null;
        DBConnectorImpl dbConnector = Main.getDbConnector();
        if (dbConnector != null) {
            country = dbConnector.getCountryJDBCTemplate().getCountry(resultSet.getInt("COUNTRY_ID"));
            job = dbConnector.getJobJDBCTemplate().getJob(resultSet.getInt("JOB_ID"));
        }
        employee.setId(resultSet.getInt("id"));
        employee.setFirstName(resultSet.getString("FIRST_NAME"));
        employee.setLastName(resultSet.getString("LAST_NAME"));
        employee.setCountry(country);
        employee.setJob(job);

        return employee;
    }
}
