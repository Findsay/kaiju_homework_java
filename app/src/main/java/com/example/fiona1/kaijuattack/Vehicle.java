package com.example.fiona1.kaijuattack;

/**
 * Created by Fiona1 on 25/10/2017.
 */

public abstract class Vehicle {
    String type;
    int healthValue;

    public Vehicle(String type, int healthValue) {
        this.type = type;
        this.healthValue = healthValue;
    }

    public String getType() {
        return type;
    }

    public int getHealthValue() {
        return healthValue;
    }
}
