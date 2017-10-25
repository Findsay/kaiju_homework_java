package com.example.fiona1.kaijuattack;

/**
 * Created by Fiona1 on 25/10/2017.
 */

public abstract class Kaiju {
    String name;
    int health;
    int attack;

    public Kaiju(String name, int health, int attack) {
        this.name = name;
        this.health = health;
        this.attack = attack;
    }

    public String roar(){
        return "Rawrrr!";

    }
}
