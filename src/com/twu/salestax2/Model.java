package com.twu.salestax2;

import java.util.ArrayList;

public class Model {
    private double totalPrice;
    private double totalTax;
    private ArrayList<Double> individualPrices;

    public Model(ArrayList<Double> individualPrices){
        this.individualPrices = individualPrices;
    }

    public double importedExceptionItems(double cost) {
        double serviceTax = (cost * 5) / 100;
        serviceTax = RoundDouble.roundUp(serviceTax, 0.05);

        totalPrice += (cost + serviceTax);
        totalTax += serviceTax;
        individualPrices.add(cost + serviceTax);
        return cost + serviceTax;
    }

    public double nonImportedExceptionItems(double cost) {
        totalPrice += cost;

        individualPrices.add(cost);
        return cost;
    }

    public double importedNonExceptionItems(double cost) {
        double serviceTax = (cost * 15) / 100;
        serviceTax = RoundDouble.roundUp(serviceTax, 0.05);

        totalPrice += (cost + serviceTax);
        totalTax += serviceTax;
        individualPrices.add(cost + serviceTax);
        return cost + serviceTax;
    }

    public double nonImportedNonExceptionItems(double cost) {
        double serviceTax = (cost * 10) / 100;
        serviceTax = RoundDouble.roundUp(serviceTax, 0.05);

        totalPrice += (cost + serviceTax);
        totalTax += serviceTax;

        individualPrices.add(cost + serviceTax);
        return cost + serviceTax;
    }

    public String getIndividualPrices() {
        String individualPrices = "";
        for(Double price : this.individualPrices){
            individualPrices += String.format("%.2f\n", price);
        }
        return individualPrices;
    }
    public String getFormattedTotalPrice() {
        return String.format("%.2f", totalPrice);
    }

    public String getFormattedTotalTax() {
        return String.format("%.2f", totalTax);
    }
}
