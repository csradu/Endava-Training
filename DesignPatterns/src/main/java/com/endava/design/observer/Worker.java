/**
 * This file is part of the Endava Graduates training program
 * Created by Calin Radu 7/29/2015
 */

package main.java.com.endava.design.observer;

import java.util.ArrayList;
import java.util.List;

public class Worker {
    private double netSalary;
    private double grossSalary;
    private List<Observer> observers = new ArrayList();

    public Worker() {
        addObservers();
    }

    public void notifyAllObservers() {
        for (Observer obs : observers) {
            obs.udpate();
        }
    }

    public void addObservers() {
        observers.add(new NetObserver(this));
        observers.add(new MailObserver(this));
        observers.add(new LoanObserver(this));
    }

    public void setGrossSalary(double grossSalary) {
        this.grossSalary = grossSalary;
        notifyAllObservers();
    }

    public double getNetSalary() {
        return netSalary;
    }

    public double getGrossSalary() {
        return grossSalary;
    }

    public void setNetSalary(double netSalary) {
        this.netSalary = netSalary;

    }
}
