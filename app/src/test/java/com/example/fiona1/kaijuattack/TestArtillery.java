package com.example.fiona1.kaijuattack;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Fiona1 on 25/10/2017.
 */

public class TestArtillery {
    Artillery artillery;

    @Before
    public void setUp() throws Exception {
        artillery = new Artillery("Starstreak", 50);

    }

    @Test
    public void canGetType() throws Exception {
        assertEquals("Starstreak", artillery.getType());
    }

    @Test
    public void canGetHealthValue() throws Exception {
        assertEquals(50, artillery.getHealthValue());
    }
}
