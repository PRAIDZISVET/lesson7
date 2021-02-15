package com.itacademy.lesson7.hero;

import com.itacademy.lesson7.hero.weapon.RangeWeapon;
import com.itacademy.lesson7.hero.weapon.Weapon;

public class Archer<X extends RangeWeapon> extends Hero<X> {


    public Archer(String name, int health) {

        super(name, 10, health);
    }

    @Override
    public void attackEnemy (Enemy enemy) {
        System.out.printf("%s пускает стрелу в %s\n", getName(), enemy.getName());
        applyDamage(enemy);
    }

}
