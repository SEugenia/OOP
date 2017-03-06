package ru.academits.shapes.saraeva;

import java.util.*;
import java.util.Collections;

/**
 * Created by ESaraeva on 27.02.2017.
 */
public class Main {
    public static void main(String[] args) {
        Square square = new Square(5);
        Rectangle rectangle = new Rectangle(4, 6);
        Rectangle rectangle2 = new Rectangle(8, 7);
        Triangle triangle = new Triangle(0, 0, 0, 15, 23, 0);
        Circle circle = new Circle(200);

        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add(square);
        shapes.add(rectangle);
        shapes.add(rectangle2);
        shapes.add(triangle);
        shapes.add(circle);

        Collections.sort(shapes, new AreasComparator());
        System.out.println(shapes.get(shapes.size() - 1));
        Collections.sort(shapes, new PerimetersComparator());
        System.out.println(shapes.get(shapes.size() - 2));
        System.out.println(rectangle.equals(rectangle2));
        System.out.println(circle.hashCode());
    }
}

