package com.example.fiona1.kaijuattack;

import com.example.fiona1.kaijuattack.behaviours.Damageable;
import com.example.fiona1.kaijuattack.behaviours.Moveable;

/**
 * Created by Fiona1 on 25/10/2017.
 */

public abstract class Kaiju implements Moveable, Damageable {
    String name;
    int healthValue;
    int attackValue;

    public Kaiju(String name, int healthValue, int attackValue) {
        this.name = name;
        this.healthValue = healthValue;
        this.attackValue = attackValue;
    }

    public String roar() {
        return "Rawrrr!";

    }

    public String getName() {
        return name;
    }

    public int getHealthValue() {
        return healthValue;
    }

    public int getAttackValue() {
        return attackValue;
    }

    public String attack(Damageable target) {
        target.takeDamage(attackValue);
        if (target.getHealthValue() > 0) {
            return (target.getName() + " survived the attack from " + name + " and has " + target.getHealthValue() + " health left");
        } else {
            return ("Oh no! " + target.getName() + " was destroyed by the attack from " + name);
        }
    }

    public void takeDamage(int damageValue) {
        this.healthValue -= damageValue;
    }


}
