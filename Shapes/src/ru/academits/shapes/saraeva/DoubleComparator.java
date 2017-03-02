package ru.academits.shapes.saraeva;

import java.util.Comparator;

/**
 * Created by ESaraeva on 02.03.2017.
 */
class DoubleComparator implements Comparator<Double> {

    @Override
    public int compare(Double o1, Double o2) {
        return o1.compareTo(o2);
    }
}

