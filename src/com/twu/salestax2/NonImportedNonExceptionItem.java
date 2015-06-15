package com.twu.salestax2;

public class NonImportedNonExceptionItem implements SalesTax {

    private Model model;
    private double cost;

    public NonImportedNonExceptionItem(Model model, double cost){
        this.model = model;
        this.cost = cost;
    }

    public void calculate() {
        model.nonImportedNonExceptionItems(cost);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof NonImportedNonExceptionItem)) return false;

        NonImportedNonExceptionItem that = (NonImportedNonExceptionItem) o;

        return Double.compare(that.cost, cost) == 0;

    }

    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(cost);
        return (int) (temp ^ (temp >>> 32));
    }
}
