package com.twu.salestax2;

public class Model {
    private double totalPrice;
    private double totalTax;
    public Model() {

    }

    public double importedExceptionItems(double cost) {
        double serviceTax = (cost * 5) / 100;
        serviceTax = RoundDouble.roundUp(serviceTax, 0.05);

        totalPrice += (cost + serviceTax);
        totalTax += serviceTax;
        git
        return cost + serviceTax;
    }
}