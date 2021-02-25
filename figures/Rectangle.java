package com.itacademy.lesson7.figures;

public class Rectangle extends Parallelogram implements RightAngle {

    private boolean angle90;

    public Rectangle(int x, int y, float width, float hight, float diagonal, boolean angle90) {
        super(x, y, width, hight, diagonal);
        this.angle90 = angle90;
    }

    public float calcDiagonal () {
        return (float) Math.sqrt(Math.pow(this.getWidth(),2) + Math.pow(this.getHight(),2));
    }

    @Override
    public String toString () {
        return "Rectangle";
    }
    @Override
    public float perimetr() {
        return this.getWidth() * 2 + this.getHight() * 2;
    }

    @Override
    public float area() {
        return this.getWidth() * this.getHight();
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
