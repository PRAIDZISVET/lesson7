package com.itacademy.lesson7.hero;

import com.itacademy.lesson7.hero.weapon.MeleeWeapon;

public class Warrior<X extends MeleeWeapon> extends Hero<X> {

    public Warrior(String name, int health) {
        super(name, 15, health);
    }

    @Override
    public void attackEnemy (Enemy enemy) {
        System.out.printf("%s бьет мечом %s\n", getName(), enemy.getName());
        applyDamage(enemy);
    }
}
