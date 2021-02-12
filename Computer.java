package com.itacademy.lesson7;

import com.itacademy.lesson6.Hdd;
import com.itacademy.lesson6.Ram;

public class Computer implements Loadble, Active {
    private static String CURRENT_VALUE = "Common";
    private String name;
    private Hdd hdd;
    private int ram;


    public Computer(String name, Hdd hdd, int ram) {

     this.name = name;
     this.hdd = hdd;
     this.ram = ram;
   }
 // Перегрузка конструктора Computer
 public Computer() {
   // this ("asdf", 500, 1024);
  }
@Override
    public void on () {
        System.out.println("Я включился " + name +" hdd: " + hdd.getCapacity() + " ram: "+ ram);
    }

    @Override
    public void load () {
        System.out.println("Я загрузился");
    }

    @Override
    public void off () {
        System.out.println("Я выключился");
    }


    // сеттеры
    public void setName (String name) {
        this.name = name;
    }

    public void setHdd(Hdd hdd) {
        this.hdd = hdd;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    //геттеры
    public String getName () {
        return this.name;
    }

    public Hdd getHdd() {
        return hdd;
    }

    public int getRam() {
        return ram;
    }
}
