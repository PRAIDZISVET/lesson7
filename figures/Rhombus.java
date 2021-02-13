package com.itacademy.lesson7.figures;

public class Rhombus extends Parallelogram implements EqualSides {

    private float diagonal2;

    public Rhombus(int x, int y, float width, float hight, boolean angle90, float diagonal, float diagonal2) {
        super(x, y, width, hight, angle90, diagonal);
        this.diagonal2 = diagonal2;
    }
    @Override
    public String toString () {
        return "Rhombus";
    }
    @Override
    public float perimetr() {
        return this.getWidth() * 4;
    }

    @Override
    public float area () {
        return (this.getDiagonal() * diagonal2) / 2;
    }

    @Override
    public boolean isEqualSides() {
        return this.getWidth() == this.getHight();
    }
}
