package com.finalproject;

public class KnifeBehavior implements WeaponBehavior{

    @Override
    public int useWeapon(Entity obj) {
        return obj.getDexterity() + obj.getVitality() + obj.getIntelligence()+ obj.getLevel();
    }
}
