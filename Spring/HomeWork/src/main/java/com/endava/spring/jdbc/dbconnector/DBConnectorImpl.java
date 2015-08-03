/**
 * This file is part of the Endava Graduates training program
 * Created by Calin Radu 8/3/2015
 */
package com.endava.spring.jdbc.dbconnector;

import com.endava.spring.jdbc.country.Country;
import com.endava.spring.jdbc.country.CountryJDBCTemplate;
import com.endava.spring.jdbc.employee.Employee;
import com.endava.spring.jdbc.employee.EmployeeJDBCTemplate;
import com.endava.spring.jdbc.job.Job;
import com.endava.spring.jdbc.job.JobJDBCTemplate;
import com.endava.spring.jdbc.main.Main;

import java.util.ArrayList;

public class DBConnectorImpl implements DBConnecter {

    private CountryJDBCTemplate countryJDBCTemplate;
    private JobJDBCTemplate jobJDBCTemplate;
    private EmployeeJDBCTemplate employeeJDBCTemplate;


    @Override
    public void initCountries() {
        ArrayList<Country> countries = Main.getContext().getBean("defaultCountries", ArrayList.class);
        for(Country c : countries) {
            countryJDBCTemplate.create(c);
        }
    }

    @Override
    public void initJobs() {
        ArrayList<Job> jobs = Main.getContext().getBean("defaultJobs", ArrayList.class);
        for(Job j : jobs) {
            jobJDBCTemplate.create(j);
        }
    }

    @Override
    public void initEmployees() {
        ArrayList<Employee> employees = Main.getContext().getBean("defaultEmployees", ArrayList.class);
        for(Employee e : employees) {
            employeeJDBCTemplate.create(e);
        }
    }

    public void setJobJDBCTemplate(JobJDBCTemplate jobJDBCTemplate) {
        this.jobJDBCTemplate = jobJDBCTemplate;
    }

    public void setCountryJDBCTemplate(CountryJDBCTemplate countryJDBCTemplate) {
        this.countryJDBCTemplate = countryJDBCTemplate;
    }

    public void setEmployeeJDBCTemplate(EmployeeJDBCTemplate employeeJDBCTemplate) {
        this.employeeJDBCTemplate = employeeJDBCTemplate;
    }

    public CountryJDBCTemplate getCountryJDBCTemplate() {
        return countryJDBCTemplate;
    }

    public JobJDBCTemplate getJobJDBCTemplate() {
        return jobJDBCTemplate;
    }

    public EmployeeJDBCTemplate getEmployeeJDBCTemplate() {
        return employeeJDBCTemplate;
    }
}
