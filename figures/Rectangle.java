package com.itacademy.lesson7.figures;

public class Rectangle extends Figure implements RightAngle {

    private float width;
    private float hight;
    private boolean angle90;

    public Rectangle(int x, int y, float width, float hight, boolean angle90) {
        super(x, y);
        this.width = width;
        this.hight = hight;
        this.angle90 = angle90;
    }

    public float calcDiagonal () {
        return (float) Math.sqrt(Math.pow(width,2) + Math.pow(hight,2));
    }

    @Override
    public String toString () {
        return "Rectangle";
    }
    @Override
    public float perimetr() {
        return width * 2 + hight * 2;
    }

    @Override
    public float area() {
        return width * hight;
    }

    @Override
    public boolean isRightAngle() {
        return angle90;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getHight() {
        return hight;
    }

    public void setHight(float hight) {
        this.hight = hight;
    }

    public boolean isAngle90() {
        return angle90;
    }

    public void setAngle90(boolean angle90) {
        this.angle90 = angle90;
    }
}
