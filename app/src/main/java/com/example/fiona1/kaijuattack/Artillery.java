package com.example.fiona1.kaijuattack;

import com.example.fiona1.kaijuattack.behaviours.Damageable;

/**
 * Created by Fiona1 on 25/10/2017.
 */

public class Artillery extends Vehicle implements Damageable {
    public Artillery(String type, int healthValue, int attackValue) {
        super(type, healthValue, attackValue);
    }
}
