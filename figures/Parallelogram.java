package com.itacademy.lesson7.figures;

public class Parallelogram extends Rectangle {


    private float diagonal;

    public Parallelogram(int x, int y, float width, float hight, boolean angle90, float diagonal) {
        super(x, y, width, hight, angle90);
        this.diagonal = diagonal;
    }

    @Override
    public String toString () {
        return "Parallelogram";
    }

    @Override
    public float perimetr() {
        return 2 * (this.getWidth() + this.getHight());
    }

    @Override
    public float area() {
        float p = (this.getWidth()+ this.getHight() + diagonal) / 2;
        return  2 * (float) Math.sqrt(p * (p - this.getWidth()) * (p - this.getHight()) * (p - diagonal)) ;
    }

    public float getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(float diagonal) {
        this.diagonal = diagonal;
    }
}
