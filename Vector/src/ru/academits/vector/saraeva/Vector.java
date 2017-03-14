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

        return "{" + vector + "}";
    }

    public void totUpVectors(double... vector2) {

        int resultDimension = Math.max(vector.length, vector2.length);
        double[] vectorResult = new double[resultDimension];
        for (int i = 0; i < Math.max(vector.length, vector2.length); ++i) {
            vectorResult[i] = vector[i] + vector2[i];
        }
    }

    public int getSize() {
        return vector.length;
    }

    public void multiplyByScalar(double scalar) {
        for (int i = 0; i < vector.length; ++i) {
            vector[i] = scalar * vector[i];
        }
    }
}
