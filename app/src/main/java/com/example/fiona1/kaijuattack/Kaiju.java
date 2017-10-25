package com.example.fiona1.kaijuattack;

import com.example.fiona1.kaijuattack.behaviours.Attackable;
import com.example.fiona1.kaijuattack.behaviours.Moveable;

/**
 * Created by Fiona1 on 25/10/2017.
 */

public abstract class Kaiju implements Moveable {
    String name;
    int healthValue;
    int attackValue;

    public Kaiju(String name, int healthValue, int attackValue) {
        this.name = name;
        this.healthValue = healthValue;
        this.attackValue = attackValue;
    }

    public String roar(){
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

    public String attack(Attackable target){
        target.takeDamage(attackValue);
        return name + " attacked with damage "+attackValue;
    }


}
