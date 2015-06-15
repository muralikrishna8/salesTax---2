package com.twu.salestax2;

public class ImportedExceptionItem implements SalesTax {
    private Model model;
    private double cost;

    public ImportedExceptionItem(Model model, double cost) {
        this.model = model;
        this.cost = cost;
    }

    @Override
    public void calculate() {
        model.importedExceptionItems(cost);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ImportedExceptionItem)) return false;

        ImportedExceptionItem that = (ImportedExceptionItem) o;

        return Double.compare(that.cost, cost) == 0;

    }

    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(cost);
        return (int) (temp ^ (temp >>> 32));
    }
}
