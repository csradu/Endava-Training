/**
 * This file is part of the Endava Graduates training program
 * Created by Calin Radu 8/3/2015
 */
package com.endava.spring.jdbc.job;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.util.List;

@Component
public class JobJDBCTemplate implements JobDAO {

    private DataSource dataSoruce;
    private JdbcTemplate jdbcTemplate;

    @Autowired
    @Override
    public void setDataSource(DataSource dataSource) {
        this.dataSoruce = dataSource;
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public void create(Job j) {
        String sql = "INSERT INTO jobs values(?, ?)";
        jdbcTemplate.update(sql, new Object[]{j.getId(), j.getName()});
    }

    public Job getJob(int id) {
        String sql = "select * from jobs where ID = ?";
        return jdbcTemplate.queryForObject(sql, new Object[]{id}, new JobMapper());
    }

    public List<Job> listJobs() {
        String sql = "select * from jobs";
        return jdbcTemplate.query(sql, new JobMapper());
    }

    public void delete(int id) {
        String sql = "DELETE FROM jobs WHERE ID = ?";
        jdbcTemplate.update(sql, new Object[]{id});
    }

    public void update(int id, String name) {
        String sql = "UPDATE jobs SET NAME = ? WHERE ID = ?";
        jdbcTemplate.update(sql, new Object[]{id, name});
    }
}
