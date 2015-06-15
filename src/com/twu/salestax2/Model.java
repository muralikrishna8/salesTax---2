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
        return cost + serviceTax;
    }

    public double nonImportedExceptionItems(double cost) {
        totalPrice += cost;

        return cost;
    }

    public double importedNonExceptionItems(double cost) {
        double serviceTax = (cost * 15) / 100;
        serviceTax = RoundDouble.roundUp(serviceTax, 0.05);

        totalPrice += (cost + serviceTax);
        totalTax += serviceTax;
        return cost + serviceTax;
    }

    public double nonImportedNonExceptionItems(double cost) {
        double serviceTax = (cost * 10) / 100;
        serviceTax = RoundDouble.roundUp(serviceTax, 0.05);

        totalPrice += (cost + serviceTax);
        totalTax += serviceTax;

        return cost + serviceTax;
    }

    public String getFormattedTotalPrice() {
        return totalPrice + "";
    }

    public String getFormattedTotalTax() {
        return totalTax + "";
    }
}
