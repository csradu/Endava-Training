/**
 * This file is part of the Endava Graduates training program
 * Created by Calin Radu 22.07.2015
 */
package com.endava.flowcontrol;

import com.endava.flowcontrol.exceptions.OverflowException;
import com.endava.flowcontrol.exceptions.UnderflowException;

import java.util.List;

/**
 * Class for implementing the functionality of a calculator
 */
public class Calculator {

    /**
     * Adds two numbers
     *
     * @return the sum of a and b
     * @throws UnderflowException if the sum exceeds Integer.MAX_VALUE
     * @throws OverflowException  if the sum is lower than Integer.MIN_VALUE
     */
    public int add(int a, int b) throws UnderflowException, OverflowException {
        long sum = (long) a + (long) b;
        if (sum < Integer.MIN_VALUE) {
            throw new UnderflowException("UnderflowException: The sum of the 2 numbers is lower than Integer.MIN_VALUE");
        } else if (sum > Integer.MAX_VALUE) {
            throw new OverflowException("OverflowException: The sum of the 2 numbers excedes Integer.MAX_VALUE");
        }
        return (int) sum;
    }

    /**
     * Divides two numbers
     *
     * @return a divided by b
     */
    public double divide(int a, int b) throws ArithmeticException {
        return a / b;
    }

    /**
     * Calculates the average value of a list
     *
     * @param list a list of integers for which to determine the average
     * @return the average value
     * @throws UnderflowException if the sum of the elements exceeds Integer.MAX_VALUE
     * @throws OverflowException  if the sum of the elements is lower than Integer.MIN_VALUE
     */
    public double average(List<Integer> list) throws UnderflowException, OverflowException {
        int sum = 0;
        for (int i : list) {
            sum = add(sum, i);
        }
        return (double) sum / list.size();
    }
}
