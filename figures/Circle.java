package com.itacademy.lesson7.figures;

public class Circle extends Figure implements Circlable {

    private int radius;

    public Circle(int x, int y, int radius) {
        super(x, y);
        this.radius = radius;
    }

    @Override
    public String toString () {
        return "Circle";
    }

    @Override
    public int getDiameter() {
        return radius * 2;
    }
    @Override
    public float circleLenth() {
        return 2 * PI * radius;
    }

    @Override
    public float perimetr() {
        return circleLenth();
    }
    @Override
    public float area () {
        return PI * (float) Math.pow(radius,2);
    }


    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}
