package com.github.bgalek.units4j;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MassTest {

    @Test
    public void testOfGrams() {
        Mass mass = Mass.ofGrams(1000);
        assertEquals(1000, mass.toGrams());
    }

    @Test
    public void testOfKilograms() {
        Mass mass = Mass.ofKilograms(1);
        assertEquals(1000, mass.toGrams(), 0.0001);
    }

    @Test
    public void testOfPounds() {
        Mass mass = Mass.ofPounds(2.20462);
        assertEquals(1000, mass.toGrams(), 0.01);
    }

    @Test
    public void testOfOunces() {
        Mass mass = Mass.ofOunces(35.274);
        assertEquals(1000, mass.toGrams(), 0.001);
    }

    @Test
    public void testToKilograms() {
        Mass mass = Mass.ofGrams(1000);
        assertEquals(1, mass.toKilograms(), 0.0001);
    }

    @Test
    public void testToPounds() {
        Mass mass = Mass.ofGrams(1000);
        assertEquals(2.20462, mass.toPounds(), 0.0001);
    }

    @Test
    public void testToOunces() {
        Mass mass = Mass.ofGrams(1000);
        assertEquals(35.274, mass.toOunces(), 0.0001);
    }

    @Test
    public void testAdd() {
        Mass mass1 = Mass.ofGrams(500);
        Mass mass2 = Mass.ofGrams(500);
        Mass result = mass1.add(mass2);
        assertEquals(1000, result.toGrams());
    }

    @Test
    public void testSubtract() {
        Mass mass1 = Mass.ofGrams(1000);
        Mass mass2 = Mass.ofGrams(500);
        Mass result = mass1.subtract(mass2);
        assertEquals(500, result.toGrams());
    }

    @Test
    public void testMultiply() {
        Mass mass = Mass.ofGrams(500);
        Mass result = mass.multiply(2);
        assertEquals(1000, result.toGrams());
    }

    @Test
    public void testDivide() {
        Mass mass = Mass.ofGrams(1000);
        Mass result = mass.divide(2);
        assertEquals(500, result.toGrams());
    }

    @Test
    public void testDivideByZero() {
        Mass mass = Mass.ofGrams(1000);
        assertThrows(ArithmeticException.class, () -> mass.divide(0));
    }

    @Test
    public void testToString() {
        Mass mass = Mass.ofGrams(1000);
        assertEquals("1000.00 grams", mass.toString());
    }
}
