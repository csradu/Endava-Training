/**
 * This file is part of the Endava Graduates training program
 * Created by Calin Radu 28.07.2015
 */
package main.java.com.endava.threads.prime;

import java.util.ArrayList;
import java.util.List;

/**
 * Thread class to determine prime numbers in a list between startIndex
 * and endIndex
 */
public class PrimeNumbers implements Runnable{

    private List<Integer> numbersList;
    private int threadNumber;

    public PrimeNumbers(ArrayList<Integer> numbersList, int threadNumber) {
        this.numbersList = numbersList;
        this.threadNumber = threadNumber;
    }

    @Override
    public void run() {
        int endIndex;
        int startIndex;
        startIndex = (numbersList.size() / Main.THREAD_NUMBER) * threadNumber;
        if (threadNumber + 1 == Main.THREAD_NUMBER) {
            endIndex = numbersList.size();
        } else {
            endIndex = (numbersList.size() / Main.THREAD_NUMBER) * (threadNumber + 1);
        }
        for(int i = startIndex; i < endIndex; i++) {
            if(isPrime(numbersList.get(i))) {
                Main.addValue(numbersList.get(i));
            }
        }
    }

    public boolean isPrime(int number) {
        if(number == 0 || number == 1) {
            return false;
        }
        for(int i = 2; i <= number / 2; i++) {
            if(number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
