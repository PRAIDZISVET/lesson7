package com.itacademy.lesson7.figures;

public class Parallelogram extends Figure {

    private float width;
    private float hight;
    private float diagonal;

    public Parallelogram(int x, int y, float width, float hight, float diagonal) {
        super(x, y);
        this.width = width;
        this.hight = hight;
        this.diagonal = diagonal;
    }

    public Parallelogram(int x, int y, float width, float hight) {
        super(x, y);
        this.width = width;
        this.hight = hight;
    }

    @Override
    public String toString () {
        return "Parallelogram";
    }

    @Override
    public float perimetr() {
        return 2 * (width + hight);
    }

    @Override
    public float area() {
        float p = (width+ hight + diagonal) / 2;
        return  2 * (float) Math.sqrt(p * (p - width) * (p - hight) * (p - diagonal)) ;
    }

    public float getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(float diagonal) {
        this.diagonal = diagonal;
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
}
