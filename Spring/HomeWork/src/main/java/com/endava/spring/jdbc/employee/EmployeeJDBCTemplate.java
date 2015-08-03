/**
 * This file is part of the Endava Graduates training program
 * Created by Calin Radu 8/3/2015
 */
package com.endava.spring.jdbc.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.util.List;

@Component
public class EmployeeJDBCTemplate implements EmployeeDAO {

    private DataSource dataSource;
    private JdbcTemplate jdbcTemplate;

    @Autowired
    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public void create(Employee e) {
        int jobId = e.getJob() == null ? null : e.getJob().getId();
        int countryId = e.getCountry() == null ? null : e.getCountry().getId();
        String sql = "insert into employees values(?, ?, ?, ?, ?)";
        jdbcTemplate.update(sql, e.getId(), e.getFirstName(), e.getLastName(), jobId, countryId);
    }

    public Employee getEmployee(int id) {
        String sql = "select * from employees where id = ?";
        return jdbcTemplate.queryForObject(sql, new Object[]{id}, new EmployeeMapper());
    }

    public List<Employee> listEmployees() {
        String sql = "select * from employees";
        return jdbcTemplate.query(sql, new EmployeeMapper());
    }

    public void delete(int id) {
        String sql = "delete from employees where id = ?";
        jdbcTemplate.update(sql, id);
    }

    public void updateCountryId(int id, int countryId) {
        String sql = "update employees set country_id = ? where id = ?";
        jdbcTemplate.update(sql, id, countryId);
    }

    public void updateJobId(int id, int jobId) {
        String sql = "update employees set job_id = ? where id = ?";
        jdbcTemplate.update(sql, id, jobId);
    }
}
