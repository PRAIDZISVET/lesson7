package com.itacademy.lesson7.figures;

public class GeometricFigures {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle (0,0,2,3,4,true);
        System.out.println(rectangle.area());

        Parallelogram parallelogram = new Parallelogram (0,0,2,3,4);
        System.out.println(parallelogram.perimetr());

        Rhombus rhombus = new Rhombus(0,0,2,2,1,3);
        System.out.println(rhombus.perimetr());

        Square square = new Square(0,0,2,2,true);
        System.out.println(square.perimetr());

        Triangle triangle = new Triangle(0,0,3,3,4,true);
        System.out.println(triangle.perimetr());

        Circle circle = new Circle(0,0,3);
        System.out.println(circle.getDiameter());

        System.out.println(circle.toString());

        System.out.println(ShapeUtils.isTriangle(circle));
        System.out.println(ShapeUtils.isRectangle(circle));
    }
}
