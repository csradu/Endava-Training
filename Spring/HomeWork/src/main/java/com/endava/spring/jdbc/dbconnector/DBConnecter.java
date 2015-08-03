package com.endava.spring.jdbc.dbconnector;

public interface DBConnecter {

    /**
     * Initialize the Countries table with the default entries
     */
    public void initCountries();

    /**
     * Initialize the Jobs table with the default entries
     */
    public void initJobs();

    /**
     * Initialize the Employees table with the default entries
     */
    public void initEmployees();

}
