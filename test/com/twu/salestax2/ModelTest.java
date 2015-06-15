package com.twu.salestax2;

import org.junit.Test;

import java.util.ArrayList;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ModelTest {
    @Test
    public void shouldBeAbleToCalculateTheSalesTaxForImportedExceptionItems() {
        Model model = new Model(new ArrayList<Double>());

        double actualPrice = model.importedExceptionItems(11.25);

        assertThat(actualPrice, is(11.85));
    }

    @Test
    public void shouldBeAbleToCalculateTheSalesTaxForNonImportedExceptionItems() {
        Model model = new Model(new ArrayList<Double>());

        double actualPrice = model.nonImportedExceptionItems(12.49);

        assertEquals(12.49, actualPrice, 0.00d);
    }

    @Test
    public void shouldBeAbleToCalculateTheSalesTaxForImportedNonExceptionItems() {
        Model model = new Model(new ArrayList<Double>());

        double actualPrice = model.importedNonExceptionItems(47.50);

        assertThat(actualPrice, is(54.65));
    }

    @Test
    public void shouldBeAbleToCalculateTheSalesTaxForNonImportedNonExceptionItems() {
        Model model = new Model(new ArrayList<Double>());

        double actualPrice = model.nonImportedNonExceptionItems(14.99);

        assertEquals(16.49, actualPrice, 0.001);
    }

    @Test
    public void shouldBeAbleToGiveTheTotalPrice() {
        Model model = new Model(new ArrayList<Double>());

        model.nonImportedExceptionItems(12.4);
        String actualTotalPrice = model.getFormattedTotalPrice();

        assertThat(actualTotalPrice, is("12.40"));
    }

    @Test
    public void shouldBeAbleToGiveTheTotalTax() {
        Model model = new Model(new ArrayList<Double>());

        model.nonImportedNonExceptionItems(10);
        String actualTotalTax = model.getFormattedTotalTax();

        assertThat(actualTotalTax, is("1.00"));
    }
}