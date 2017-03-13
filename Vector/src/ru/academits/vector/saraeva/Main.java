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
        System.out.println(Arrays.toString(arr2));
        System.out.println(vector3.getSize());
        //System.out.print(Arrays.toString(vector.totUpVectors(arr)));
        System.out.print(Arrays.toString(vector.multiplyByScalar(4, arr)));
    }
}
