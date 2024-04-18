package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    @Test
    public void testAddition() {
        double result = Calculator.add(5.0, 3.0);
        assertEquals(8.0, result);
    }

    @Test
    public void testSubtraction() {
        double result = Calculator.subtract(5.0, 3.0);
        assertEquals(2.0, result);
    }

    @Test
    public void testMultiplication() {
        double result = Calculator.multiply(5.0, 3.0);
        assertEquals(15.0, result);
    }

    @Test
    public void testDivision() {
        double result = Calculator.divide(6.0, 3.0);
        assertEquals(2.0, result);
    }

    @Test
    public void testDivisionByZero() {
        assertThrows(IllegalArgumentException.class, () -> {
            Calculator.divide(6.0, 0.0);
        });
    }
}