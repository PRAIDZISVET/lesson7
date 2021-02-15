package com.itacademy.lesson7.hero;

import com.itacademy.lesson8.Outer;

public class BeastMaster extends Hero{

    private Pet pet;

    public BeastMaster(String name, int damage, int health) {
        super(name, damage, health);
        this.pet = new Pet("Barbos", 30, 50);
    }

//    public static class Pet {
//        String name = "Barbos";
//    }

   @Override
    public void takeDamage (int damage) {
       if (pet.isAlive()) {
           pet.takeDamage(damage);
       } else {
           super.takeDamage(damage);
       }
    }

    public class Pet extends Hero {
        public Pet(String name, int damage, int health) {
            super(name, damage, health);
        }

        @Override
        public void attackEnemy(Enemy enemy) {
            System.out.printf("%s атакует %s\n", getName(), enemy.getName());
            applyDamage(enemy);
        }

    }
    //BeastMaster.Pet pet = new BeastMaster.Pet();

    @Override
    public void attackEnemy (Enemy enemy) {
        if (pet.isAlive()) {
            pet.attackEnemy(enemy);
        } else {
            System.out.printf("%s атакует %s\n", getName(), enemy.getName());
            applyDamage(enemy);
        }
    }
}
