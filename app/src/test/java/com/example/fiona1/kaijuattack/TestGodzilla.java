package com.example.fiona1.kaijuattack;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Fiona1 on 25/10/2017.
 */

public class TestGodzilla {
    Godzilla godzilla;
    Artillery artillery;


    @Before
    public void setUp() throws Exception {
        godzilla = new Godzilla("Godzilla", 100, 25);
        artillery = new Artillery("Starstreak", 50, 60);


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

    @Test
    public void canRoar() throws Exception {
        assertEquals("Rawrrr!", godzilla.roar());

    }

    @Test
    public void canAttack() throws Exception {
        assertEquals("Starstreak survived the attack from Godzilla and has 25 health left", godzilla.attack(artillery));
    }

    @Test
    public void canMove() throws Exception {
        assertEquals("Godzilla slithered away", godzilla.move());

    }

    @Test
    public void canTakeDamage() throws Exception {
        godzilla.takeDamage(50);
        assertEquals(50, godzilla.getHealthValue());
    }
}
