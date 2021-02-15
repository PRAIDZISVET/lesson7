package com.itacademy.lesson7.hero;

public class Mage extends Hero {

    private Gender gender;

    public Mage(String name, int health, Gender gender) {
        super(name,20, health);
        this.gender = gender;
    }

    @Override
    public void attackEnemy (Enemy enemy) {
        System.out.printf(gender.getDescription() + "%s колдует заклинания над %s\n", getName(), enemy.getName());
        applyDamage(enemy);
    }
}


