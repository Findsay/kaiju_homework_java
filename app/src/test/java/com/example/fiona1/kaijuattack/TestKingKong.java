package com.example.fiona1.kaijuattack;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Fiona1 on 25/10/2017.
 */

public class TestKingKong {
    KingKong kingkong;

    @Before
    public void setUp() throws Exception {
        kingkong = new KingKong("King Kong", 150, 50);
    }

    @Test
    public void canGetName() throws Exception {
        assertEquals("King Kong", kingkong.getName());
    }

    @Test
    public void canGetHealthValue() throws Exception {
        assertEquals(150, kingkong.getHealthValue());
    }

    @Test
    public void canGetAttackValue() throws Exception {
        assertEquals(50, kingkong.getAttackValue());
    }
}
