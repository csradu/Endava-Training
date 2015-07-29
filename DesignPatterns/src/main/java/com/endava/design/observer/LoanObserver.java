/**
 * This file is part of the Endava Graduates training program
 * Created by Calin Radu 7/29/2015
 */
package main.java.com.endava.design.observer;

import main.java.com.endava.design.Worker;

public class LoanObserver extends Observer {
    private Worker worker;
    private double netSalary;

    public LoanObserver(Worker worker) {
        this.worker = worker;
    }

    @Override
    public void udpate() {
        if (worker.getNetSalary() > 5000 && netSalary < 5000) {
            System.out.println("Making a loan");
        }
        this.netSalary = worker.getNetSalary();
    }
}
