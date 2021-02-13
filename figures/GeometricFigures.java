package com.itacademy.lesson7.figures;

public class GeometricFigures {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle (0,0,2,3,true);
        System.out.println(rectangle.area());

        Parallelogram parallelogram = new Parallelogram (0,0,2,3,false,3);
        System.out.println(parallelogram.area());

        Rhombus rhombus = new Rhombus(0,0,2,2,false,3,2);
        System.out.println(rhombus.area());

        Square square = new Square(0,0,2,2,true);
        System.out.println(square.area());

        Triangle triangle = new Triangle(0,0,3,3,5,true);
        System.out.println(triangle.area());

        Circle circle = new Circle(0,0,3);
        System.out.println(circle.getDiameter());

        System.out.println(circle.toString());
    }
}
