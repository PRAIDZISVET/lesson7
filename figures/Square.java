package com.itacademy.lesson7.figures;

public class Square extends Rectangle implements RightAngle,EqualSides {

    public Square(int x, int y, float width, float hight, boolean angle90) {
        super(x, y, width, hight, angle90);
    }
    @Override
    public String toString () {
        return "Square";
    }
    @Override
    public float perimetr () {
        return this.getWidth() * 4;
    }

    @Override
    public float area () {
        return (float) Math.pow(getWidth(),2);
    }

    @Override
    public boolean isEqualSides() {
        return this.getWidth() == this.getHight();
    }
}
