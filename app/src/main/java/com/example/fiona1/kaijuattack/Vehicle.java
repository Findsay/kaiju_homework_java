package com.example.fiona1.kaijuattack;

import com.example.fiona1.kaijuattack.behaviours.Combatable;
import com.example.fiona1.kaijuattack.behaviours.Damageable;

import static android.R.attr.name;

/**
 * Created by Fiona1 on 25/10/2017.
 */

public abstract class Vehicle implements Damageable, Combatable {
    String type;
    int healthValue;
    int attackValue;

    public Vehicle(String type, int healthValue, int attackValue) {
        this.type = type;
        this.healthValue = healthValue;
        this.attackValue = attackValue;
    }

    public String getName() {
        return type;
    }

    public int getHealthValue() {
        return healthValue;
    }

    public void takeDamage(int damageValue) {
        this.healthValue -= damageValue;
    }

    public String strongAttack(Damageable target) {
        target.takeDamage(attackValue+20);
        if (target.getHealthValue() > 0) {
            return (target.getName() + " survived the strong attack from " + type + " and has " + target.getHealthValue() + " health left");
        } else {
            return ("Great! " + target.getName() + " was defeated by a strong attack from " + type);
        }
    }

    public String weakAttack(Damageable target) {
        target.takeDamage(attackValue - 10);
        if (target.getHealthValue() > 0) {
            return (target.getName() + " survived the weak attack from " + type + " and has " + target.getHealthValue() + " health left");
        } else {
            return ("Great! " + target.getName() + " was defeated by a weak attack from " + type);
        }
    }


}
