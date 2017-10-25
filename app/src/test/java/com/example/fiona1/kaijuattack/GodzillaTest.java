package com.example.fiona1.kaijuattack;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Fiona1 on 25/10/2017.
 */

public class GodzillaTest {
    Godzilla godzilla;

    @Before
    public void setUp() throws Exception {
        godzilla = new Godzilla("Godzilla", 100, 25);
    }

    @Test
    public void canGetName() throws Exception {
        assertEquals("Godzilla", godzilla.getName());
    }

    @Test
    public void canGetHealthValue() throws Exception {
        assertEquals(100, godzilla.getHealthValue());
    }

    @Test
    public void canGetAttackValue() throws Exception {
        assertEquals(25, godzilla.getAttackValue());
    }


}
