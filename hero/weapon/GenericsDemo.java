package com.itacademy.lesson7.hero.weapon;

import com.itacademy.lesson7.hero.Archer;
import com.itacademy.lesson7.hero.Hero;
import com.itacademy.lesson7.hero.Warrior;

public class GenericsDemo {
    public static void main(String[] args) {
        Archer <RangeWeapon> archer = new Archer<>("Леголас", 100);
        checkHero(archer);
    }

    public  static  void checkHero (Hero<? super RangeWeapon > hero) {
    }
}
