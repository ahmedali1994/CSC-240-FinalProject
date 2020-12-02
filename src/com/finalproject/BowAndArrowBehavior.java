package com.finalproject;

public class BowAndArrowBehavior implements WeaponBehavior{

    @Override
    public int useWeapon(Entity obj) {
        return obj.getDexterity() + obj.getVitality() + obj.getIntelligence()+ obj.getLevel();
    }
}
