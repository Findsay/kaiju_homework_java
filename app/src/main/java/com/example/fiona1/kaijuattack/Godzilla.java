package com.example.fiona1.kaijuattack;

/**
 * Created by Fiona1 on 25/10/2017.
 */

public class Godzilla extends Kaiju {
    public Godzilla(String name, int healthValue, int attackValue) {
        super(name, healthValue, attackValue);
    }

    @Override
    public String move() {
        return name+ " slithered away";
    }
}
