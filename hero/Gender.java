package com.itacademy.lesson7.hero;

public enum Gender implements Descriable{
    MALE("Мужчина") {

    },
    FEMAIL("Женщина") {

    };

    private String description;

    Gender(String description) {
        this.description = description;
    }

    @Override
    public String getDescription() {
        return this.description;
    }
}
