package com.twu.salestax2;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ModelTest {
    @Test
    public void shouldBeAbleToCalculateTheSalesTaxForImportedExceptionItems() {
        Model model = new Model();

        double actualPrice = model.importedExceptionItems(11.25);

        assertThat(actualPrice, is(11.85));
    }

    @Test
    public void shouldBeAbleToCalculateTheSalesTaxForNonImportedExceptionItems() {
        Model model = new Model();

        double actualPrice = model.nonImportedExceptionItems(12.49);

        assertEquals(12.49, actualPrice, 0.00d);
    }

    @Test
    public void shouldBeAbleToCalculateTheSalesTaxForImportedNonExceptionItems() {
        Model model = new Model();

        double actualPrice = model.importedNonExceptionItems(47.50);

        assertThat(actualPrice, is(54.65));
    }

    @Test
    public void shouldBeAbleToCalculateTheSalesTaxForNonImportedNonExceptionItems() {
        Model model = new Model();

        double actualPrice = model.nonImportedNonExceptionItems(14.99);

        assertEquals(16.49, actualPrice, 0.001);
    }

}