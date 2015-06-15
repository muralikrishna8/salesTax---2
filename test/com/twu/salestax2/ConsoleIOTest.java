package com.twu.salestax2;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ConsoleIOTest {
    private ByteArrayInputStream byteArrayInputStream;

    @Test
    public void shouldReadTheItemsDetails() {
        String input = "1 book at 12.49";
        byteArrayInputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(byteArrayInputStream);
        ConsoleIO inputOutputHandler = new ConsoleIO(new Scanner(System.in));

        String actualInput = inputOutputHandler.read();

        assertThat(actualInput, is("1 book at 12.49"));
    }
}