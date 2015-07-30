/**
 * This file is part of the Endava Graduates training program
 * Created by Calin Radu 7/30/2015
 */
package com.endava.graduates.trainings.services;

import static org.junit.Assert.*;

import com.endava.graduates.trainings.file.FileReadInterface;
import com.endava.graduates.trainings.file.StubFileRead;
import com.endava.graduates.trainings.utils.StringUtils;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

@RunWith(PowerMockRunner.class)
@PrepareForTest(StringUtils.class)
public class RankServiceTestCase {
    private RankService service;
    private FileReadInterface readFile;

    @BeforeClass
    public static void setUpClass() {
        PowerMockito.mockStatic(StringUtils.class);
        PowerMockito.when(StringUtils.toUpperCase(Mockito.anyString())).thenReturn("test");
        PowerMockito.when(StringUtils.concatStrings(Mockito.anyString(),Mockito.anyString())).thenReturn("test");
        PowerMockito.when(StringUtils.substringValue(Mockito.anyString(), Mockito.anyInt())).thenReturn("test");
    }

    @Before
    public void setUp() {
        readFile = new StubFileRead();
        service = new RankService(readFile);
    }

    @Test
    public void testRankService() throws Exception {
        assertFalse(service.obtaintRankFromFile());
    }

}
