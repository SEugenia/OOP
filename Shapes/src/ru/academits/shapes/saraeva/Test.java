package ru.academits.shapes.saraeva;

import java.util.ArrayList;

/**
 * Created by ESaraeva on 28.02.2017.
 */
public class Test {
    public static void main(String[] args) {
        int area1 = 6;
        int area2 = 5;
        int area3 = 12;
        int area4 = 2;
        System.out.println(getMaxArea(4));
    }

    public static int getMaxArea(int numberOfElements, int... areas) {
        int temp = 0;
        for (int i = 0; i < numberOfElements - 1; ++i) {
            if (areas[i] > temp) {
                temp = areas[i];
            }
        }
        return temp;
    }
ArrayList<Double> areas=new ArrayList<>();

}