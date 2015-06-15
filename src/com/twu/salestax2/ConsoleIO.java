package com.twu.salestax2;

import java.util.Scanner;

public class ConsoleIO {

    private Scanner scanner;

    public ConsoleIO(Scanner scanner){
        this.scanner = scanner;
    }

    public String read() {
        return scanner.nextLine();
    }

    public int readInt() {
        return scanner.nextInt();
    }

    public void print(String data){
        System.out.println(data);
    }
}
