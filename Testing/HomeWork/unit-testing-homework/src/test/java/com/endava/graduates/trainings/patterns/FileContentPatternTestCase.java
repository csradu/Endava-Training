/**
 * This file is part of the Endava Graduates training program
 * Created by Calin Radu 7/30/2015
 */
package com.endava.graduates.trainings.patterns;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FileContentPatternTestCase {
    private FileContentPattern filePattern;

    @Before
    public void setUp() {
        filePattern = new FileContentPattern();
    }

    @After
    public void tearDown() {
        filePattern = null;
    }

    @Test
    public void testContentPatternAgent6() throws Exception {
        String expected = "Secret Agent";
        String actual = filePattern.verifyContent("agent", 6);
        assertEquals(expected, actual);
    }

    @Test
    public void testContentPatternAgent4() throws Exception {
        String actual = filePattern.verifyContent("agent", 4);
        assertNull(actual);
    }

    @Test
    public void testContentPatternSuperAgent6() throws Exception {
        String expected = "Super Secret Agent";
        String actual = filePattern.verifyContent("superAgent", 6);
        assertEquals(expected, actual);
    }

    @Test(expected = Exception.class)
    public void testContentPatternSuperAgent4() throws Exception {
        filePattern.verifyContent("superAgent", 4);
    }

    @Test
    public void testContentPatternNull() throws Exception {
        String actual = filePattern.verifyContent(null, 10);
        assertNull(actual);
    }

    @Test
    public void testContentPatternNotAgent() throws Exception {
        String actual = filePattern.verifyContent("Test", 20);
        assertNull(actual);
    }


}
