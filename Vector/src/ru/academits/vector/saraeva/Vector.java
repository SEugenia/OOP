package ru.academits.vector.saraeva;

/**
 * Created by ESaraeva on 13.03.2017.
 */
public class Vector {
    private double[] vector;

    public Vector(int dimension) {                // конструктор а
        this.vector = new double[dimension];
    }

    public Vector(Vector vectorObject) {          // конструктор b
        this(vectorObject.vector);
    }

    public Vector(double[] vectorArray) {
        this.vector = new double[vectorArray.length];
        System.arraycopy(vectorArray, 0, this.vector, 0, vectorArray.length);
    }

    public Vector(int dimension, double[] vectorArray) {     //конструктор d
        this.vector = new double[dimension];

        System.arraycopy(vectorArray, 0, this.vector, 0, Math.min(vector.length, vectorArray.length));
    }

    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append('{');
        for (double aVector : vector) {
            builder.append(aVector);
            builder.append(',');
            builder.append(' ');
        }
        builder.delete(builder.length() - 2, builder.length());
        builder.append('}');
        return builder.toString();
    }


    public void addUpVectors(Vector vector2) {

        if (vector2.getSize() < vector.length) {

            for (int i = vector2.getSize(); i < vector.length; ++i) {
                vector2.vector[i] = 0;
            }
        }

        for (int i = 0; i < vector.length; ++i) {
            vector2.vector[i] = vector[i] + vector2.vector[i];
        }
    }

    public void multiplyByScalar(double scalar) {
        for (int i = 0; i < vector.length; ++i) {
            vector[i] = scalar * vector[i];
        }
    }

    public void rotateVector() {
        multiplyByScalar(-1);
    }

    public int getSize() {
        return vector.length;
    }
}