/**
 * This file is part of the Endava Graduates training program
 * Created by Calin Radu 7/29/2015
 */
package main.java.com.endava.design.observer;

import main.java.com.endava.design.Worker;

public abstract class Observer {
    protected Worker worker;
    public abstract void udpate();
}
