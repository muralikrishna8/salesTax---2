package com.twu.salestax2;

import java.util.ArrayList;
import java.util.Scanner;

public class SalesTaxInit {
    public static void main(String[] args) {
        Model model = new Model(new ArrayList<Double>());
        Parser parser = new Parser(model);
        ConsoleIO consoleIO = new ConsoleIO(new Scanner(System.in));

        App app = new App(model, parser, consoleIO);

        app.start();
    }
}
