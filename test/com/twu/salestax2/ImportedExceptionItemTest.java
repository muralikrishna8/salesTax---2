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
public class ImportedExceptionItemTest {

    @Mock
    Model model;

    @Test
    public void shouldBeAbleToCallImportedExceptionItemsTaxCalculationOnExecution() {
        ImportedExceptionItem importedExceptionItem = new ImportedExceptionItem(model, 4.0);

        importedExceptionItem.calculate();

        verify(model).importedExceptionItems(4.0);
    }
    
    @Test
    public void equalityShouldSatisfyReflexivity() {
        ImportedExceptionItem importedExcetionItem = new ImportedExceptionItem(model, 4.0);
    
        assertThat(importedExcetionItem, is(equalTo(importedExcetionItem)));
    }
    
    @Test
    public void equalityShouldSatisfySymmetricity() {
        ImportedExceptionItem importedExcetionItem = new ImportedExceptionItem(model, 4.0);
        ImportedExceptionItem otherImportedExcetionItem = new ImportedExceptionItem(model, 4.0);
    
        assertThat(importedExcetionItem, is(equalTo(otherImportedExcetionItem)));
        assertThat(otherImportedExcetionItem, is(equalTo(importedExcetionItem)));
    }
    
    @Test
    public void equalityShouldSatisfyTransitivity() {
        ImportedExceptionItem importedExcetionItem = new ImportedExceptionItem(model, 4.0);
        ImportedExceptionItem otherImportedExcetionItem = new ImportedExceptionItem(model, 4.0);
        ImportedExceptionItem anotherImportedExcetionItem = new ImportedExceptionItem(model, 4.0);
    
        assertThat(importedExcetionItem, is(equalTo(otherImportedExcetionItem)));
        assertThat(otherImportedExcetionItem, is(equalTo(anotherImportedExcetionItem)));
        assertThat(importedExcetionItem, is(equalTo(anotherImportedExcetionItem)));
    }
    
    @Test
    public void equalityShouldReturnFalseOnPassingNull() {
        ImportedExceptionItem importedExcetionItem = new ImportedExceptionItem(model, 4.0);
    
        assertFalse(importedExcetionItem.equals(null));
    }

    @Test
    public void equalityShouldReturnFalseOnPassingOtherObject() {
        ImportedExceptionItem importedExcetionItem = new ImportedExceptionItem(model, 4.0);
    
        assertFalse(importedExcetionItem.equals(new String("Hello, World")));
    }
    
    @Test
    public void whenTwoObjectsAreEqualThenTheirHashCodeMustBeEqual() {
        ImportedExceptionItem importedExcetionItem = new ImportedExceptionItem(model, 4.0);
        ImportedExceptionItem otherImportedExcetionItem = new ImportedExceptionItem(model, 4.0);
    
        assertThat(importedExcetionItem, is(equalTo(otherImportedExcetionItem)));
        assertThat(importedExcetionItem.hashCode(), is(equalTo(otherImportedExcetionItem.hashCode())));
    }
}