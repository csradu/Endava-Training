/**
 * This file is part of the Endava Graduates training program
 * Created by Calin Radu 8/1/2015
 */
package com.endava.flowcontrol;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.runner.RunWith;

import com.endava.flowcontrol.exceptions.OverflowException;
import com.endava.flowcontrol.exceptions.UnderflowException;
import org.junit.*;
import org.powermock.modules.junit4.PowerMockRunner;

import java.util.ArrayList;
@RunWith(PowerMockRunner.class)
public class CalculatorTestCase {

    private Calculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator();
    }

    @After
    public void tearDown() {
        calculator = null;
    }

    @Test(expected = OverflowException.class)
    public void testOverflowException() throws OverflowException, UnderflowException {
        calculator.add(Integer.MAX_VALUE, 5);
    }

    @Test(expected = UnderflowException.class)
    public void testUnderflowException() throws OverflowException, UnderflowException {
        calculator.add(Integer.MIN_VALUE, -10);
    }

    @Test
    public void testNormalAdd() throws OverflowException, UnderflowException {
        int actual = calculator.add(10, 5);
        int expected = 15;
        assertEquals(actual, expected);
    }

    @Test
    public void testNormalDivide() {
        double actual = calculator.divide(18, 4);
        double expected = 18 / 4;
        assertEquals(Double.compare(actual, expected), 0);
    }

    @Test(expected = ArithmeticException.class)
    public void testZeroDivide() {
        calculator.divide(18, 0);
    }

    @Test(expected = NullPointerException.class)
    public void testAverageNullList() throws UnderflowException, OverflowException {
        calculator.average(null);
    }

    @Test
    public void testNormalAverage()  throws UnderflowException, OverflowException {
        Calculator calc = mock(Calculator.class);
        when(calc.add(0, 4)).thenReturn(4);
        when(calc.add(4, 9)).thenReturn(13);
        when(calc.add(13, 22)).thenReturn(35);
        when(calc.average(anyList())).thenCallRealMethod();

        ArrayList<Integer> list = new ArrayList();
        list.add(4);
        list.add(9);
        list.add(22);
        double actual = calc.average(list);
        double expected = (double)(4+ 9 + 22) / 3;
        assertEquals(Double.compare(actual, expected), 0);
    }
}
