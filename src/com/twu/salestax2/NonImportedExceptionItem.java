package com.twu.salestax2;

public class NonImportedExceptionItem implements SalesTax {

    private Model model;
    private double cost;

    public NonImportedExceptionItem(Model model, double cost){
        this.model = model;
        this.cost = cost;
    }

    public void calculate() {
        model.nonImportedExceptionItems(cost);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof NonImportedExceptionItem)) return false;

        NonImportedExceptionItem that = (NonImportedExceptionItem) o;

        return Double.compare(that.cost, cost) == 0;

    }

    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(cost);
        return (int) (temp ^ (temp >>> 32));
    }
}
