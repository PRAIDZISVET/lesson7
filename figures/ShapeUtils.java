package com.itacademy.lesson7.figures;

public class ShapeUtils {

    public static boolean isRectangle (Object object) {
        return  (object instanceof Rectangle);
    }

    public static boolean isTriangle (Figure figure) {
        return  (figure instanceof Triangle);
    }
}

