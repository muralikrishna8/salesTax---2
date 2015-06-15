package com.twu.salestax2;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class ImportedNonExceptionItemTest {
    @Mock
    Model model;

    @Test
    public void shouldBeAbleToCallImportedNonExceptionItemsTaxCalculationOnExecution() {
        ImportedNonExceptionItem importedNonExceptionItem = new ImportedNonExceptionItem(model, 4.0);

        importedNonExceptionItem.calculate();

        verify(model).importedNonExceptionItems(4.0);
    }

    @Test
    public void equalityShouldSatisfyReflexivity() {
        ImportedNonExceptionItem importedNonExceptionItem = new ImportedNonExceptionItem(model, 4.0);

        assertThat(importedNonExceptionItem, is(equalTo(importedNonExceptionItem)));
    }

    @Test
    public void equalityShouldSatisfySymmetricity() {
        ImportedNonExceptionItem importedNonExceptionItem = new ImportedNonExceptionItem(model, 4.0);
        ImportedNonExceptionItem otherImportedNonExceptionItem = new ImportedNonExceptionItem(model, 4.0);

        assertThat(importedNonExceptionItem, is(equalTo(otherImportedNonExceptionItem)));
        assertThat(otherImportedNonExceptionItem, is(equalTo(importedNonExceptionItem)));
    }

    @Test
    public void equalityShouldSatisfyTransitivity() {
        ImportedNonExceptionItem importedNonExceptionItem = new ImportedNonExceptionItem(model, 4.0);
        ImportedNonExceptionItem otherImportedNonExceptionItem = new ImportedNonExceptionItem(model, 4.0);
        ImportedNonExceptionItem anotherImportedNonExceptionItem = new ImportedNonExceptionItem(model, 4.0);

        assertThat(importedNonExceptionItem, is(equalTo(otherImportedNonExceptionItem)));
        assertThat(otherImportedNonExceptionItem, is(equalTo(anotherImportedNonExceptionItem)));
        assertThat(importedNonExceptionItem, is(equalTo(anotherImportedNonExceptionItem)));
    }

    @Test
    public void equalityShouldReturnFalseOnPassingNull() {
        ImportedNonExceptionItem importedNonExceptionItem = new ImportedNonExceptionItem(model, 4.0);

        assertFalse(importedNonExceptionItem.equals(null));
    }

    @Test
    public void equalityShouldReturnFalseOnPassingOtherObject() {
        ImportedNonExceptionItem importedNonExceptionItem = new ImportedNonExceptionItem(model, 4.0);

        assertFalse(importedNonExceptionItem.equals(new String("Hello, World")));
    }

    @Test
    public void whenTwoObjectsAreEqualThenTheirHashCodeMustBeEqual() {
        ImportedNonExceptionItem importedNonExceptionItem = new ImportedNonExceptionItem(model, 4.0);
        ImportedNonExceptionItem otherImportedNonExceptionItem = new ImportedNonExceptionItem(model, 4.0);

        assertThat(importedNonExceptionItem, is(equalTo(otherImportedNonExceptionItem)));
        assertThat(importedNonExceptionItem.hashCode(), is(equalTo(otherImportedNonExceptionItem.hashCode())));
    }
}