/**
 * This file is part of the Endava Graduates training program
 * Created by Calin Radu 8/1/2015
 */
package com.endava.flowcontrol;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BackAroundTestCase {

    private BackAround backAround;

    @Before
    public void setUp() {
        backAround = new BackAround();
    }

    @After
    public void tearDown() {
        backAround = null;
    }

    @Test
    public void testNull() {
        String actual = backAround.backAround(null);
        assertNull(actual);
    }

    @Test
    public void testNormalString() {
        String actual = backAround.backAround("nice string mate");
        String expected = "enice string matee";
        assertEquals(actual, expected);
    }

}
