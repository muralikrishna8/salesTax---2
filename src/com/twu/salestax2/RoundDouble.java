package com.twu.salestax2;

public class RoundDouble {
    public static double roundUp(double value, double step) {
        double multiplicand = Math.ceil(value / step);
        return step * multiplicand;
    }
}
