package com.itacademy.lesson7.hero;

public abstract class Enemy implements Mortal {
    private int health;
    private String name;
    private int damage;

    public Enemy(String name, int health, int damage) {
        this.name = name;
        this.health = health;
        this.damage = damage;
    }

    public void attackHero (Hero hero) {
        System.out.printf("%s бьет %s\n", getName(), hero.getName());
        hero.takeDamage(damage);
    }

    public abstract void takeDamage (int damage); //{
//        System.out.println(getName() + " получает " + damage + " урона.");
//        if (damage >= this.health) {
//          //  System.out.println(getName() + " погибает.");
//           kill();
//        } else {
//            this.health -= damage;
//        }
//    }

    @Override
    public boolean isAlive() {
        return health > 0;
    }

    @Override
    public void kill() {
        System.out.println(getName() + " погибает");
        this.health = 0;
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


}
