/**
 * This file is part of the Endava Graduates training program
 * Created by Calin Radu 7/30/2015
 */
package com.endava.graduates.trainings.patterns;

import static org.junit.Assert.*;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class SuperAgentPatternTestCase {
    private SuperAgentPattern superAgent;

    @Before
    public void setUp() {
        superAgent = new SuperAgentPattern();
    }

    @After
    public void tearDown() {
        superAgent = null;
    }

    @Test
    public void testHavingSuperAgent() {
        List<String> list = new ArrayList();
        list.add("Super Secret Agent");
        list.add("Test");
        boolean expected = true;
        boolean actual = superAgent.checkIfSuperAgent(list);
        assertEquals(expected, actual);
    }

    @Test
    public void testNotHavingSuperAgent() {
        List<String> list = new ArrayList();
        list.add("Test");
        boolean expected = false;
        boolean actual = superAgent.checkIfSuperAgent(list);
        assertEquals(expected, actual);
    }

    @Test
    public void testForNullList() {
        List<String> list = null;
        boolean expected = false;
        boolean actual = superAgent.checkIfSuperAgent(list);
        assertEquals(expected, actual);
    }
}
