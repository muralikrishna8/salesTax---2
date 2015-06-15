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
public class NonImportedNonExceptionItemTest {
    @Mock
    Model model;

    @Test
    public void shouldBeAbleToCallNonImportedNonExceptionItemsTaxCalculationOnExecution() {
        NonImportedNonExceptionItem nonImportedNonExceptionItem = new NonImportedNonExceptionItem(model, 4.0);

        nonImportedNonExceptionItem.calculate();

        verify(model).nonImportedNonExceptionItems(4.0);
    }

    @Test
    public void equalityShouldSatisfyReflexivity() {
        NonImportedNonExceptionItem nonImpNonExceptionItem = new NonImportedNonExceptionItem(model, 4.0);

        assertThat(nonImpNonExceptionItem, is(equalTo(nonImpNonExceptionItem)));
    }

    @Test
    public void equalityShouldSatisfySymmetricity() {
        NonImportedNonExceptionItem nonImpNonExceptionItem = new NonImportedNonExceptionItem(model, 4.0);
        NonImportedNonExceptionItem otherNonImpNonExceptionItem = new NonImportedNonExceptionItem(model, 4.0);

        assertThat(nonImpNonExceptionItem, is(equalTo(otherNonImpNonExceptionItem)));
        assertThat(otherNonImpNonExceptionItem, is(equalTo(nonImpNonExceptionItem)));
    }

    @Test
    public void equalityShouldSatisfyTransitivity() {
        NonImportedNonExceptionItem nonImpNonExceptionItem = new NonImportedNonExceptionItem(model, 4.0);
        NonImportedNonExceptionItem otherNonImpNonExceptionItem = new NonImportedNonExceptionItem(model, 4.0);
        NonImportedNonExceptionItem anotherNonImpNonExceptionItem = new NonImportedNonExceptionItem(model, 4.0);

        assertThat(nonImpNonExceptionItem, is(equalTo(otherNonImpNonExceptionItem)));
        assertThat(otherNonImpNonExceptionItem, is(equalTo(anotherNonImpNonExceptionItem)));
        assertThat(nonImpNonExceptionItem, is(equalTo(anotherNonImpNonExceptionItem)));
    }

    @Test
    public void equalityShouldReturnFalseOnPassingNull() {
        NonImportedNonExceptionItem nonImpNonExceptionItem = new NonImportedNonExceptionItem(model, 4.0);

        assertFalse(nonImpNonExceptionItem.equals(null));
    }

    @Test
    public void equalityShouldReturnFalseOnPassingOtherObject() {
        NonImportedNonExceptionItem nonImpNonExceptionItem = new NonImportedNonExceptionItem(model, 4.0);

        assertFalse(nonImpNonExceptionItem.equals(new String("Hello, World")));
    }

    @Test
    public void whenTwoObjectsAreEqualThenTheirHashCodeMustBeEqual() {
        NonImportedNonExceptionItem nonImpNonExceptionItem = new NonImportedNonExceptionItem(model, 4.0);
        NonImportedNonExceptionItem otherNonImpNonExceptionItem = new NonImportedNonExceptionItem(model, 4.0);

        assertThat(nonImpNonExceptionItem, is(equalTo(otherNonImpNonExceptionItem)));
        assertThat(nonImpNonExceptionItem.hashCode(), is(equalTo(otherNonImpNonExceptionItem.hashCode())));
    }
}