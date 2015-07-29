/**
 * This file is part of the Endava Graduates training program
 * Created by Calin Radu 7/29/2015
 */
package main.java.com.endava.design.observer;

public class NetObserver extends Observer {
    private Worker worker;

    public NetObserver(Worker worker) {
        this.worker = worker;
    }

    @Override
    public void udpate() {
        double grossSalary = worker.getGrossSalary();
        double netSalary = (double)70/100 * grossSalary;
        worker.setNetSalary(netSalary);
        System.out.println("Net salary: " + worker.getNetSalary());
    }
}
