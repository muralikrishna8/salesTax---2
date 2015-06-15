package com.twu.salestax2;

public class App {

    private Model model;
    private Parser parser;
    private ConsoleIO consoleIO;

    public App(Model model, Parser parser, ConsoleIO consoleIO) {
        this.model = model;
        this.parser = parser;
        this.consoleIO = consoleIO;
    }

    public void start() {
        consoleIO.print("Enter No.of items: ");
        int noOfItems = consoleIO.readInt();
        String temp = consoleIO.read();
        for (int i = 0; i < noOfItems; i++) {
            String input = consoleIO.read();
            SalesTax salesTax = parser.parse(input);
            salesTax.calculate();
        }
        consoleIO.print(model.getIndividualPrices());
        consoleIO.print("Sales Taxes: "+model.getFormattedTotalTax());
        consoleIO.print("Total: "+model.getFormattedTotalPrice());
    }
}
