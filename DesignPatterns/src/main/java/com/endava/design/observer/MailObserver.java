/**
 * This file is part of the Endava Graduates training program
 * Created by Calin Radu 7/29/2015
 */
package main.java.com.endava.design.observer;

import main.java.com.endava.design.Worker;

public class MailObserver extends Observer {
    private Worker worker;
    private double netSalary;

    public MailObserver(Worker worker) {
        this.worker = worker;
    }

    @Override
    public void udpate() {
        if (worker.getNetSalary() > netSalary) {
            System.out.println("Sending mail");
        }
        this.netSalary = worker.getNetSalary();
    }
}
