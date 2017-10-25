package com.example.fiona1.kaijuattack;

import com.example.fiona1.kaijuattack.behaviours.Attackable;

/**
 * Created by Fiona1 on 25/10/2017.
 */

public class Tank extends Vehicle implements Attackable {
    public Tank(String type, int healthValue) {
        super(type, healthValue);
    }



}
