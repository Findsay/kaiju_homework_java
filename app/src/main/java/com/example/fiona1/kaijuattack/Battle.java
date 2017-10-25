package com.example.fiona1.kaijuattack;

/**
 * Created by Fiona1 on 25/10/2017.
 */

public class Battle {

    public static void main(String[] args) {
        Godzilla godzilla = new Godzilla("Godzilla", 200, 25);
        KingKong kingkong = new KingKong("King Kong", 100, 35);
        Artillery artillery = new Artillery("Starstreak", 50, 60);
        Tank tank = new Tank("Warrior", 200, 90);

        System.out.println(godzilla.getName() + " says " + godzilla.roar());
        System.out.println(kingkong.getName() + " says " + kingkong.roar());

        System.out.println(godzilla.attack(tank));
        System.out.println(godzilla.attack(tank));

        System.out.println(artillery.strongAttack(godzilla));
        System.out.println(tank.weakAttack(godzilla));

        System.out.println(kingkong.attack(artillery));
        System.out.println(kingkong.attack(artillery));

        System.out.println(tank.weakAttack(kingkong));

        System.out.println(kingkong.move());

















    }
}
