package com.example.fiona1.kaijuattack;

import com.example.fiona1.kaijuattack.behaviours.Attackable;

/**
 * Created by Fiona1 on 25/10/2017.
 */

public class Artillery extends Vehicle implements Attackable {
    public Artillery(String type, int healthValue) {
        super(type, healthValue);
    }
}
