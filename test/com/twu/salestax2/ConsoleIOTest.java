package com.twu.salestax2;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.*;

public class ConsoleIOTest {
    private ByteArrayInputStream byteArrayInputStream;

    @Test
    public void shouldReadTheItemsDetails() {
        String input = "1 book at 12.49";
        byteArrayInputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(byteArrayInputStream);
        ConsoleIO consoleIO = new ConsoleIO(new Scanner(System.in));
        String actualInput = consoleIO.read();

        assertThat(actualInput, is("1 book at 12.49"));
    }

    @Test
    public void shouldPrintTheData() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(byteArrayOutputStream));
        ConsoleIO consoleIO = new ConsoleIO(new Scanner(System.in));

        consoleIO.print("1 book : 12.49");
        String actualMessage = byteArrayOutputStream.toString();

        assertThat(actualMessage, is(equalTo("1 book : 12.49\n")));
    }
}