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
}