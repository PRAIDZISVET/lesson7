package com.itacademy.lesson7.figures;

public class Triangle extends Figure implements RightAngle, EqualSides {

    private float side1;
    private float side2;
    private float side3;
    private boolean angle90;

    public Triangle(int x, int y, float side1, float side2, float side3, boolean angle90) {
        super(x, y);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.angle90 = angle90;
    }
    
    @Override
    public String toString () {
        return "Triangle";
    }
    @Override
    public float perimetr() {
        float result;
        if (this.isEqualSides()) {
            result = side1 * 3;
        } else {
            result = side1 + side2 + side3;
        }
        return result;
    }

    @Override
    public boolean isRightAngle() {
        return angle90;
    }

    @Override
    public boolean isEqualSides() {
        return (side1 == side2 && side1 == side3);
    }

    @Override
    public float area() {
        float result;
        if (this.isRightAngle()) {
            result = side1 * side2 / 2;
        } else if (this.isEqualSides()) {
            result = (float) Math.pow(side1,2) * (float) Math.sqrt(3) /4;
        } else {
            result = 999999;
        }
        return result;
    }

    public float getSide1() {
        return side1;
    }

    public void setSide1(float side1) {
        this.side1 = side1;
    }

    public float getSide2() {
        return side2;
    }

    public void setSide2(float side2) {
        this.side2 = side2;
    }

    public float getSide3() {
        return side3;
    }

    public void setSide3(float side3) {
        this.side3 = side3;
    }
}
