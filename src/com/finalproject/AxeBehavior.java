package com.finalproject;

public class AxeBehavior implements WeaponBehavior{

    @Override
    public int useWeapon(Entity obj) {
        return obj.getVitality() + obj.getStrength() + obj.getEndurance()+ obj.getLevel();
    }
}
