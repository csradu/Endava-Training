/**
 * This file is part of the Endava Graduates training program
 * Created by Calin Radu 8/3/2015
 */
package com.endava.spring.jdbc.job;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class JobMapper implements RowMapper<Job> {

    public Job mapRow(ResultSet resultSet, int i) throws SQLException {
        Job job = new Job();
        job.setId(resultSet.getInt("ID"));
        job.setName(resultSet.getString("NAME"));
        return job;
    }
}
