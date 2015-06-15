package com.twu.salestax2;

public class ImportedNonExceptionItem implements SalesTax {

    private Model model;
    private double cost;

    public ImportedNonExceptionItem(Model model, double cost) {
        this.model = model;
        this.cost = cost;
    }

    @Override
    public void calculate() {
        model.importedNonExceptionItems(cost);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ImportedNonExceptionItem)) return false;

        ImportedNonExceptionItem that = (ImportedNonExceptionItem) o;

        return Double.compare(that.cost, cost) == 0;

    }

    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(cost);
        return (int) (temp ^ (temp >>> 32));
    }
}
