/**
 * This file is part of the Endava Graduates training program
 * Created by Calin Radu 7/30/2015
 */
package com.endava.graduates.trainings.utils;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class StringUtilsTestCase {
    private StringUtils stringUtils;

    @Before
    public void setUp() {
        stringUtils = new StringUtils();
    }

    @After
    public void tearDown() {
        stringUtils = null;
    }

    @Test
    public void testToUpperCase() {
        String expected = "TEST";
        String actual = stringUtils.toUpperCase("test");
        assertEquals(expected, actual);
    }

    @Test
    public void testConcatStrings() {
        String firstString = "test";
        String secondString = "AnotherTeSt";
        String expected = "testAnotherTeSt";
        String actual = stringUtils.concatStrings(firstString, secondString);
        assertEquals(expected, actual);
    }

    @Test
    public void testSubstringWithLowerLengthValue() {
        String expected = "t";
        String actual = stringUtils.substringValue("Test", 3);
        assertEquals(expected, actual);
    }

    @Test
    public void tesSubstringWithHigherLengthValue() {
        String expected = "";
        String actual = stringUtils.substringValue("Test", 5);
        assertEquals(expected, actual);
    }

}
