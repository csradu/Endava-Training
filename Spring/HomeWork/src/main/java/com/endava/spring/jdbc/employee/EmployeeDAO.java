package com.endava.spring.jdbc.employee;

import javax.sql.DataSource;
import java.util.List;

public interface EmployeeDAO {

    public void setDataSource(DataSource dataSource);

    /**
     * Create a record in the Employee table
     */
    public void create(Employee e);

    /**
     * Get a record having the specified id from the Employee table
     */
    public Employee getEmployee(int id);

    /**
     * Get all the employees in the Employee table
     */
    public List<Employee> listEmployees();

    /**
     * Delete a record from the Employee table identified by the id
     */
    public void delete(int id);

    /**
     * Change the country id of an employee
     */
    public void updateCountryId(int id, int countryId);

    /**
     * Change the job id of an employee
     */
    public void updateJobId(int id, int jobId);

}
