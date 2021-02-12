package com.itacademy.lesson7;

import com.itacademy.lesson6.Hdd;

public class Demo {
    public static void main(String[] args) {
        Computer computer = new Computer("PC",new Hdd(1000),2048);
       // computer.on();
        check(computer);
        System.out.println();

        Notebook notebook = new Notebook ("Mac", new Hdd(500), 1024);
        //notebook.on();
        check(notebook);
    }

    public static void check (Computer computer) {
        computer.on();
        computer.load();
        computer.off();
    }
}
