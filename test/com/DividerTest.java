package com;

import org.junit.*;
import org.junit.rules.*;

import static org.assertj.core.api.Assertions.*;

public class DividerTest {
    private Divider subject;

    @Rule
    public final ExpectedException expectedException = ExpectedException.none();

    @Before
    public void setUp() {
        subject = new Divider();
    }

    @Test
    public void divide_whenGivenNonZeroDenominator_returnsResult() {
        int result = subject.divide(10, 5);

        assertThat(result).isEqualTo(2);
    }

    @Test
    public void divide_whenGivenZeroDenominator_returnsResult() {
        expectedException.expect(IllegalArgumentException.class);
        expectedException.expectMessage("Cannot divide by zero!");

        subject.divide(10, 0);
    }
}
