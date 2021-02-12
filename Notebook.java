package com.itacademy.lesson7;

import com.itacademy.lesson6.Hdd;
import com.itacademy.lesson6.Ram;

public class Notebook extends Computer {

//    private String temp;
//
//    public Notebook(String temp) {
//        this.temp = temp;
//    }

    public Notebook(String name, Hdd hdd, int ram) {
        super(name, hdd, ram);      // обязательно первой строчкой !!!!
    }


    public void open () {
        System.out.println("Крышка открылась");
    }
    public void on () {
        open();
        super.on();
    }
}
