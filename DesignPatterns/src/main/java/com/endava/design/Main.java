/**
 * This file is part of the Endava Graduates training program
 * Created by Calin Radu 7/29/2015
 */
package main.java.com.endava.design;
public class Main {
    public static void main(String[] args) {
        Worker worker = new Worker();
        System.out.println("Changing gross salary to 7700");
        worker.setGrossSalary(7700);
        System.out.println("-----------------");
        System.out.println("Changing gross salary to 8000");
        worker.setGrossSalary(8000);
        System.out.println("-----------------");
        System.out.println("Changing gross salary to 4000");
        worker.setGrossSalary(4000);
        System.out.println("-----------------");
        System.out.println("Changing gross salary to 10000");
        worker.setGrossSalary(10000);
        System.out.println("-----------------");
    }
}
