package ru.academits.vector.saraeva;

import java.util.Arrays;

/**
 * Created by ESaraeva on 13.03.2017.
 */
public class Main {
    public static void main(String[] args) {
        double[] arr = {1, 9};
        double[] arr2 = {1, 4, 0, 11, 6, 8};
        Vector vector3 = new Vector(arr);
        Vector vector = new Vector(arr2);
        for (int i = 0; i < vector.getSize(); ++i) {
            System.out.println(vector.toString());
        }
        System.out.println(vector3.getSize());
        vector.multiplyByScalar(4);
        //System.out.print(Arrays.toString(vector.totUpVectors(arr)));

    }
}
