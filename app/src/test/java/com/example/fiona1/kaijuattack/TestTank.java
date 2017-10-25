package com.example.fiona1.kaijuattack;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Fiona1 on 25/10/2017.
 */

public class TestTank {
    Tank tank;
    KingKong kingkong;

    @Before
    public void setUp() throws Exception {
        tank = new Tank("Warrior", 200, 75);
        kingkong = new KingKong("King Kong", 150, 50);
    }

    @Test
    public void canGetType() throws Exception {
        assertEquals("Warrior", tank.getName());
    }

    @Test
    public void canGetHealthValue() throws Exception {
        assertEquals(200, tank.getHealthValue());
    }

    @Test
    public void canTakeDamage() throws Exception {
        tank.takeDamage(50);
        assertEquals(150, tank.getHealthValue());
    }

    @Test
    public void canWeakAttack() throws Exception {
        assertEquals("King Kong survived the weak attack from Warrior and has 85 health left", tank.weakAttack(kingkong));

    }

    @Test
    public void canStrongAttack() throws Exception {
        assertEquals("King Kong survived the strong attack from Warrior and has 55 health left", tank.strongAttack(kingkong));

    }

    @Test
    public void canDestroyWithAttack() throws Exception {
        tank.strongAttack(kingkong);
        assertEquals("Great! King Kong was defeated by a strong attack from Warrior", tank.strongAttack(kingkong));

    }
}
