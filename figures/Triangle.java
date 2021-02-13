package com.itacademy.lesson7.figures;

public class Triangle extends Rectangle implements RightAngle, EqualSides {

    private float side3;
    public Triangle(int x, int y, float width, float hight,float side3, boolean angle90) {
        super(x, y, width, hight, angle90);
        this.side3 = side3;
    }
    @Override
    public String toString () {
        return "Triangle";
    }
    @Override
    public float perimetr() {
        float result;
        if (this.isEqualSides()) {
            result = this.getWidth() * 3;
        } else {
            result = this.getWidth() + this.getHight() + side3;
        }
        return result;
    }

    @Override
    public boolean isRightAngle() {
        return this.isAngle90();
    }

    @Override
    public boolean isEqualSides() {
        return (this.getWidth() == this.getHight() && this.getWidth() == side3);
    }

    @Override
    public float area() {
        float result;
        if (this.isRightAngle()) {
            result = this.getWidth() * this.getHight() / 2;
        } else if (this.isEqualSides()) {
            result = (float) Math.pow(this.getWidth(),2) * (float) Math.sqrt(3) /4;
        } else {
            result = 999999;
        }
        return result;
    }
}
