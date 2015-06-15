package com.twu.salestax2;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class ParserTest {
    @Mock
    Model model;

    private Parser parser;
    @Before
    public void setUp() {
        parser = new Parser(model);
    }

    @Test
    public void shouldGiveNull() {
        assertNull(parser.parse("1 imported box of chocolates: 10.50"));
    }

    @Test
    public void shouldGetImportedExceptionItemForImportedChocolates() {
        SalesTax actual = parser.parse("1 box of imported chocolates at 11.25");

        assertEquals(actual, new ImportedExceptionItem(model, 11.25));
    }

    @Test
    public void shouldGetImportedNonExceptionItemForImportedPerfume() {
        SalesTax actual = parser.parse("1 imported bottle of perfume at 27.99");

        assertEquals(actual, new ImportedNonExceptionItem(model, 27.99));
    }
}