package com.finalproject;

public class Thief extends Entity{
    public Thief()
    {
        setName("Thief");
        setHealth(100);
        setLevel(1);
        setVitality(2);
        setDexterity(8);
        setLevel(1);
        setStrength(3);
        setResistance(1);
        setEndurance(0);
        setIntelligence(2);
        setWeaponBehavior(new KnifeBehavior());
        setAttack();
    }

}
