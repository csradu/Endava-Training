/**
 * This file is part of the Endava Graduates training program
 * Created by Calin Radu 8/3/2015
 */
package com.endava.spring.jdbc.main;

import com.endava.spring.jdbc.country.Country;
import com.endava.spring.jdbc.dbconnector.DBConnectorImpl;
import com.endava.spring.jdbc.employee.Employee;
import com.endava.spring.jdbc.job.Job;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;

public class Main {

    private static DBConnectorImpl dbConnector;
    private static ApplicationContext context;

    public static void main(String[] args) {
        context = new ClassPathXmlApplicationContext("application-context.xml");
        dbConnector = context.getBean("dBConnectorImpl", DBConnectorImpl.class);

        //Initializing the database
        if(dbConnector.getEmployeeJDBCTemplate().listEmployees().isEmpty()) {
            dbConnector.initCountries();
            dbConnector.initJobs();
            dbConnector.initEmployees();
        }
        printDataBase();
    }

    private static void printDataBase() {

        //Listing all countries
        System.out.println("Countries in the database: ");
        ArrayList<Country> countries = (ArrayList) dbConnector.getCountryJDBCTemplate().listCountries();
        for(Country c : countries) {
            System.out.println(c);
        }
        System.out.println("-------------------\n");


        //Listing all the jobs
        System.out.println("Jobs in the database: ");
        ArrayList<Job> jobs = (ArrayList) dbConnector.getJobJDBCTemplate().listJobs();
        for(Job j : jobs) {
            System.out.println(j);
        }
        System.out.println("-------------------\n");

        //Listing all the employees
        System.out.println("Employees in the database: ");
        ArrayList<Employee> employees = (ArrayList) dbConnector.getEmployeeJDBCTemplate().listEmployees();
        for(Employee e : employees) {
            System.out.println(e);
        }
    }

    public static DBConnectorImpl getDbConnector() {
        return dbConnector;
    }

    public static ApplicationContext getContext() {
        return context;
    }
}
