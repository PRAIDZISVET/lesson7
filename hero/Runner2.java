package com.itacademy.lesson7.hero;

public class Runner2 {
    public static void main(String[] args) {
        Gender male = Gender.MALE;
        Gender femail = Gender.FEMAIL;
        System.out.println(male.ordinal());
        System.out.println(femail.ordinal());
        Gender [] values = Gender.values();
       // Gender mail1 = Gender.valueOf("MAIL");
        Gender male1 = Gender.valueOf("MALE");

        Mage mage = new Mage("София",100,Gender.FEMAIL);
        mage.attackEnemy(new Zombie("Юрий",12,12));
    }
}
