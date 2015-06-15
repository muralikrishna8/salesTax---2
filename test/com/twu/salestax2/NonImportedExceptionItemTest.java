package com.twu.salestax2;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.*;
import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class NonImportedExceptionItemTest {
    @Mock
    Model model;

    @Test
    public void shouldBeAbleToCallNonImportedExceptionItemsTaxCalculationOnExecution() {
        NonImportedExceptionItem nonImportedExceptionItem = new NonImportedExceptionItem(model, 4.0);

        nonImportedExceptionItem.calculate();

        verify(model).nonImportedExceptionItems(4.0);
    }

    @Test
    public void equalityShouldSatisfyReflexivity() {
        NonImportedExceptionItem nonImpExceptionItem = new NonImportedExceptionItem(model, 4.0);

        assertThat(nonImpExceptionItem, is(equalTo(nonImpExceptionItem)));
    }

    @Test
    public void equalityShouldSatisfySymmetricity() {
        NonImportedExceptionItem nonImpExceptionItem = new NonImportedExceptionItem(model, 4.0);
        NonImportedExceptionItem otherNonImpExceptionItem = new NonImportedExceptionItem(model, 4.0);

        assertThat(nonImpExceptionItem, is(equalTo(otherNonImpExceptionItem)));
        assertThat(otherNonImpExceptionItem, is(equalTo(nonImpExceptionItem)));
    }

    @Test
    public void equalityShouldSatisfyTransitivity() {
        NonImportedExceptionItem nonImpExceptionItem = new NonImportedExceptionItem(model, 4.0);
        NonImportedExceptionItem otherNonImpExceptionItem = new NonImportedExceptionItem(model, 4.0);
        NonImportedExceptionItem anotherNonImpExceptionItem = new NonImportedExceptionItem(model, 4.0);

        assertThat(nonImpExceptionItem, is(equalTo(otherNonImpExceptionItem)));
        assertThat(otherNonImpExceptionItem, is(equalTo(anotherNonImpExceptionItem)));
        assertThat(nonImpExceptionItem, is(equalTo(anotherNonImpExceptionItem)));
    }

    @Test
    public void equalityShouldReturnFalseOnPassingNull() {
        NonImportedExceptionItem nonImpExceptionItem = new NonImportedExceptionItem(model, 4.0);

        assertFalse(nonImpExceptionItem.equals(null));
    }

    @Test
    public void equalityShouldReturnFalseOnPassingOtherObject() {
        NonImportedExceptionItem nonImpExceptionItem = new NonImportedExceptionItem(model, 4.0);

        assertFalse(nonImpExceptionItem.equals(new String("Hello, World")));
    }

    @Test
    public void whenTwoObjectsAreEqualThenTheirHashCodeMustBeEqual() {
        NonImportedExceptionItem nonImpExceptionItem = new NonImportedExceptionItem(model, 4.0);
        NonImportedExceptionItem otherNonImpExceptionItem = new NonImportedExceptionItem(model, 4.0);

        assertThat(nonImpExceptionItem, is(equalTo(otherNonImpExceptionItem)));
        assertThat(nonImpExceptionItem.hashCode(), is(equalTo(otherNonImpExceptionItem.hashCode())));
    }
}