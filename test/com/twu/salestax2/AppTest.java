package com.twu.salestax2;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import static org.mockito.Mockito.verify;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class AppTest {

    @Mock
    Model model;
    @Mock
    Parser parser;
    @Mock
    ConsoleIO consoleIO;

    private App app;

    @Before
    public void setUp(){
        app = new App(model, parser, consoleIO);
    }

    @Test
    public void shouldReadUserInput() {
        when(consoleIO.read()).thenReturn("1 box of imported chocolates at 11.25");
        app.start();

        verify(consoleIO).read();
    }
}