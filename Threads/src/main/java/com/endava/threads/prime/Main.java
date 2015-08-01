/**
 * This file is part of the Endava Graduates training program
 * Created by Calin Radu 28.07.2015
 */
package com.endava.threads.prime;

import com.endava.threads.prime.PrimeNumbers;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    //List of random generated numbers
    private static ArrayList<Integer> numbersList = new ArrayList();
    private static ArrayList<Thread> threadList = new ArrayList();
    private static ArrayList<Integer> primeNumbers = new ArrayList();
    public static int THREAD_NUMBER = 2;
    private static Random random;


    public static synchronized void addValue(int value) {
        primeNumbers.add(value);
    }

    public static void main(String[] args) {

        random = new Random();
        PrimeNumbers currentThread;

        for (int i = 0; i < 10; i++) {
            int test = random.nextInt(100);
            numbersList.add(test);
        }

        for (int i = 0; i < THREAD_NUMBER; i++) {
            currentThread = new PrimeNumbers(numbersList, i);
            Thread thread = new Thread(currentThread);
            threadList.add(thread);
            thread.start();
        }
        try {
            for (int i = 0; i < THREAD_NUMBER; i++) {
                threadList.get(i).join();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("The list of numbers: " + numbersList);
        System.out.println("The list of prime numbers: " + primeNumbers);
    }
}
