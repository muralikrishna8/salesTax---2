package com.twu.salestax2;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class RoundDoubleTest {
    @Test
    public void shouldRoundTheDoubleToNearestZeroPointZeroFive() {
        RoundDouble roundDouble = new RoundDouble();

        Double actualRoundedValue = roundDouble.roundUp(6.125, 0.05);

        assertThat(actualRoundedValue, is(6.15));
    }
}