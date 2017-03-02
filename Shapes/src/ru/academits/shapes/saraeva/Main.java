package ru.academits.shapes.saraeva;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by ESaraeva on 27.02.2017.
 */
public class Main {
    public static void main(String[] args) {
        Shape.Square square = new Shape.Square(5);
        Shape.Rectangle rectangle = new Shape.Rectangle(4, 6);
        Shape.Rectangle rectangle2 = new Shape.Rectangle(8, 7);
        Shape.Triangle triangle = new Shape.Triangle(0, 0, 0, 3, 4, 0);
        Shape.Circle circle = new Shape.Circle(10);
        //double[] areas = {square.getArea(), circle.getArea(), rectangle.getArea(), rectangle2.getArea(), triangle.getArea()};
        //System.out.println(getMaxSquare(areas));
        ArrayList<Double> areas = new ArrayList<>();
        areas.add(square.getArea());
        areas.add(rectangle.getArea());
        areas.add(rectangle2.getArea());
        areas.add(triangle.getArea());
        areas.add(circle.getArea());
        ArrayList<Double> perimeters = new ArrayList<>();
        areas.add(square.getPerimeter());
        areas.add(rectangle.getPerimeter());
        areas.add(rectangle2.getPerimeter());
        areas.add(triangle.getPerimeter());
        areas.add(circle.getPerimeter());
    }

    public static double getMaxSquare(ArrayList<Double> areas) {
        for (int i = 0; i < areas.size() - 1; ++i) {
            //  double temp = areas.get(i + 1);
           // ArrayList<Double> temp = new ArrayList<>(Arrays.asList(areas.get(i + 1)));
            ArrayList<Double> temp = new ArrayList<>(Arrays.asList(7));
          //  temp = areas.get(i + 1);
            //temp.add(areas.get(i + 1));
            if (temp > areas[i]) {
                continue;
            }
            int j = i + 1;
            while (j > 0 && temp <= areas[j - 1]) {
                areas[j] = areas[j - 1];
                --j;
            }
            areas[j] = temp;
        }

   /* public static double getMaxSquare(double[] areas) {
        double temp = 0;
        for (int i = 0; i < areas.length; ++i) {
            if (areas[i] > temp) {
                temp = areas[i];
            }
        }
        return temp;
    }*/

    }