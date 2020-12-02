package com.finalproject;

public class SwordBehavior implements WeaponBehavior{

    @Override
    public int useWeapon(Entity obj) {
        return obj.getDexterity() + obj.getResistance() + obj.getStrength() + obj.getLevel();
    }
}
