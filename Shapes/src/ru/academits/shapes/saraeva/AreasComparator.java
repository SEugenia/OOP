package ru.academits.shapes.saraeva;

import java.util.Comparator;

/**
 * Created by ESaraeva on 06.03.2017.
 */
public class AreasComparator implements Comparator<Shape> {
    public int compare(Shape shape1, Shape shape2) {
        if (shape1.getArea() > shape2.getArea()) {
            return 1;
        } else if (shape1.getArea() < shape2.getArea()) {
            return -1;
        } else {
            return 0;
        }
    }
}
