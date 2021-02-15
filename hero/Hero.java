package com.itacademy.lesson7.hero;

import com.itacademy.lesson7.hero.weapon.Weapon;

public abstract class Hero <T extends Weapon> implements Mortal {

    private String name;
    private int damage;
    private int health;
    private T weapon;

    public Hero(String name, int damage, int health) {
        this.name = name;
        this.damage = damage;
        this.health = health;
    }

    public void takeDamage (int damage) {
        System.out.println(getName() + " получает " + damage + " урона.");
        if (damage >= this.health) {
            //  System.out.println(getName() + " погибает.");
            kill();
        } else {
            this.health -= damage;
        }
    }

    @Override
    public boolean isAlive() {
        return health > 0;
    }

    @Override
    public void kill() {
        System.out.println(getName() + " погибает");
        this.health = 0;
    }

    public abstract void attackEnemy (Enemy enemy);

    public void applyDamage (Enemy enemy) {
        enemy.takeDamage(damage);
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public T getWeapon() {
        return weapon;
    }

    public void setWeapon(T weapon) {
        this.weapon = weapon;
    }
}
