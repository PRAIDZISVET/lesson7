package com.itacademy.lesson7.figures;

public class Square extends Parallelogram implements RightAngle,EqualSides {
    private boolean angle90;

    public Square(int x, int y, float width, float hight, boolean angle90) {
        super(x, y, width, hight);
        this.angle90 = angle90;
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

    @Override
    public boolean isRightAngle() {
        return angle90;
    }

    public boolean isAngle90() {
        return angle90;
    }

    public void setAngle90(boolean angle90) {
        this.angle90 = angle90;
    }
}
