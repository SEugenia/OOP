package ru.academits.shapes.saraeva;

/**
 * Created by ESaraeva on 03.03.2017.
 */
public class Square implements Shape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override

    public double getWidth() {
        return side;
    }

    @Override

    public double getHeight() {
        return side;
    }

    @Override

    public double getArea() {
        return side * side;
    }

    @Override

    public double getPerimeter() {
        return 4 * side;
    }

    public String toString() {
        return "" + "сторона квадрата: " + side + ", периметр квадрата: " + getPerimeter() + ", площадь квадрата: " + getArea() + "";
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if ((o == null) || o.getClass() != this.getClass()) {
            return false;
        }
        Square square = (Square) o;
        return side == square.side;
    }

    public int hashCode() {
        final int prime = 37;
        int hash = 1;
        hash = prime * hash + (int) side;
        return hash;
    }
}


