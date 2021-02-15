package com.itacademy.lesson7.hero;

public class BattleGround2 {
    public static void main(String[] args) {
        Enemy enemy = new Zombie ("Василий", 45, 50);
        Hero beastMaster = new BeastMaster ("Ваня", 25, 100);

        killHero(new Mortal() {
            @Override
            public boolean isAlive() {
                return false;
            }

            @Override
            public void kill() {
                System.out.println("Безымянный");
            }
        });
//        while (enemy.isAlive() && beastMaster.isAlive()) {
//            beastMaster.attackEnemy(enemy);
//            if (enemy.isAlive()) {
//                enemy.attackHero(beastMaster);
//            }
//        }
    }

    private static void killHero (Mortal mortal) {
        mortal.kill();
    }
}
