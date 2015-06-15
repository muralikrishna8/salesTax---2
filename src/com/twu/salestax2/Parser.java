package com.twu.salestax2;

public class Parser {
    private Model model;

    public Parser(Model model){
        this.model = model;
    }

    public SalesTax parse(String item){
        String[] tokens = item.split(" ");
        double cost = getCost(tokens);

        if(item.contains("import")){
            if(item.contains("chocolate")){
                return new ImportedExceptionItem(model, cost);
            }
            if(item.contains("perfume")){
                return  new ImportedNonExceptionItem(model, cost);
            }
        } else {
            if(item.contains("chocolate")){
                return new NonImportedExceptionItem(model, cost);
            }
            if(item.contains("CD")){
                return new NonImportedNonExceptionItem(model, cost);
            }
            if(item.contains("perfume")) {
                return new NonImportedNonExceptionItem(model, cost);
            }
            if(item.contains("book")) {
                return new NonImportedExceptionItem(model, cost);
            }
            if(item.contains("pills")) {
                return new NonImportedExceptionItem(model, cost);
            }
        }

        return null;
    }

    private double getCost(String[] tokens) {
        return Double.parseDouble(tokens[tokens.length - 1]);
    }
}
