package com.endava.spring.jdbc.job;

import javax.sql.DataSource;
import java.util.List;

public interface JobDAO {

    public void setDataSource(DataSource dataSource);

    /**
     * Create a record in the Job table
     */
    public void create(Job j);

    /**
     * Get a record having the specified id from the Job table
     */
    public Job getJob(int id);

    /**
     * Get all the jobs in the Job table
     */
    public List<Job> listJobs();

    /**
     * Delete a record from the job table identified by the id
     */
    public void delete(int id);

    /**
     * Change the name of a record in the Job table
     */
    public void update(int id, String name);

}

