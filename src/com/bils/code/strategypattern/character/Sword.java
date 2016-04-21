package com.bils.code.strategypattern.character;

/**
 * Created by nabilla on 3/20/16.
 */
public class Sword implements WeaponBehavior {

    @Override
    public void useWeapon() {
        System.out.println("I'm using Sword weapon");
    }
}
