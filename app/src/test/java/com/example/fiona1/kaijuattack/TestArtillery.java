package com.example.fiona1.kaijuattack;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Fiona1 on 25/10/2017.
 */

public class TestArtillery {
    Artillery artillery;
    Godzilla godzilla;

    @Before
    public void setUp() throws Exception {
        artillery = new Artillery("Starstreak", 50, 60);
        godzilla = new Godzilla("Godzilla", 100, 25);

    }

    @Test
    public void canGetType() throws Exception {
        assertEquals("Starstreak", artillery.getName());
    }

    @Test
    public void canGetHealthValue() throws Exception {
        assertEquals(50, artillery.getHealthValue());
    }

    @Test
    public void canTakeDamage() throws Exception {
        artillery.takeDamage(50);
        assertEquals(0, artillery.getHealthValue());
    }

    @Test
    public void canWeakAttack() throws Exception {
        assertEquals("Godzilla survived the weak attack from Starstreak and has 50 health left", artillery.weakAttack(godzilla));

    }

    @Test
    public void canStrongAttack() throws Exception {
        assertEquals("Godzilla survived the strong attack from Starstreak and has 20 health left", artillery.strongAttack(godzilla));

    }

    @Test
    public void canDestroyWithAttack() throws Exception {
        artillery.strongAttack(godzilla);
        assertEquals("Great! Godzilla was defeated by a strong attack from Starstreak", artillery.strongAttack(godzilla));

    }

}
