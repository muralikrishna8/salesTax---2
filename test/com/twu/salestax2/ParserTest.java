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
    public void shouldGiveNullForItemsNotInList() {
        assertNull(parser.parse("1 something 12.44"));
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

    @Test
    public void shouldGetNonImportedExceptionItemForNonImportedChocolate() {
        SalesTax actual = parser.parse("1 chocolate bar at 0.85");

        assertEquals(actual, new NonImportedExceptionItem(model, 0.85));
    }

    @Test
    public void shouldGetNonImportedExceptionItemForNonImportedPills() {
        SalesTax actual = parser.parse("1 packet of headache pills at 9.75");

        assertEquals(actual, new NonImportedExceptionItem(model, 9.75));
    }

    @Test
    public void shouldGetNonImportedExceptionItemForNonImportedBooks() {
        SalesTax actual = parser.parse("1 book at 12.49");

        assertEquals(actual, new NonImportedExceptionItem(model, 12.49));
    }


    @Test
    public void shouldGetNonImportedNonExceptionItemForNonImportedCD() {
        SalesTax actual = parser.parse("1 music CD at 14.99");

        assertEquals(actual, new NonImportedNonExceptionItem(model, 14.99));
    }

    @Test
    public void shouldGetNonImportedNonExceptionItemForNonImportedPerfume() {
        SalesTax actual = parser.parse("1 bottle of perfume at 18.99");

        assertEquals(actual, new NonImportedNonExceptionItem(model, 18.99));
    }
}