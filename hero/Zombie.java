package com.itacademy.lesson7.hero;

public class Zombie extends Enemy {

    private boolean diedOnce;

    public Zombie(String name, int health, int damage) {

        super(name, health, damage);
    }

    @Override
    public void takeDamage (int damage) {
        System.out.println(getName() + " получает " + damage + " урона.");
        if (damage >= getHealth()) {
          if (diedOnce) {
              kill();
          } else {
              diedOnce = true;
              setHealth(10);
              System.out.println(getName() + " воскрес, здоровье равно: " + getHealth());
          }

        } else {
            int newhealth = getHealth();
            newhealth -= damage;
            setHealth(newhealth);
        }
    }
}
