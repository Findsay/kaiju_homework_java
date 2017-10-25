package com.example.fiona1.kaijuattack;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Fiona1 on 25/10/2017.
 */

public class TestTank {
    Tank tank;

    @Before
    public void setUp() throws Exception {
        tank = new Tank("Warrior", 200);

    }

    @Test
    public void canGetType() throws Exception {
        assertEquals("Warrior", tank.getType());
    }

    @Test
    public void canGetHealthValue() throws Exception {
        assertEquals(200, tank.getHealthValue());
    }
}