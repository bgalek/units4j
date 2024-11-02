package com.github.bgalek.units4j;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LengthTest {

    @Test
    public void testOfMeters() {
        Length length = Length.ofMeters(1);
        assertEquals(1, length.toMeters());
    }

    @Test
    public void testOfKilometers() {
        Length length = Length.ofKilometers(1);
        assertEquals(1000, length.toMeters());
    }

    @Test
    public void testOfCentimeters() {
        Length length = Length.ofCentimeters(100);
        assertEquals(1, length.toMeters());
    }

    @Test
    public void testOfInches() {
        Length length = Length.ofInches(39.3701);
        assertEquals(1, length.toMeters(), 0.0001);
    }

    @Test
    public void testOfFeet() {
        Length length = Length.ofFeet(3.28084);
        assertEquals(1, length.toMeters(), 0.0001);
    }

    @Test
    public void testToKilometers() {
        Length length = Length.ofMeters(1000);
        assertEquals(1, length.toKilometers());
    }

    @Test
    public void testToCentimeters() {
        Length length = Length.ofMeters(1);
        assertEquals(100, length.toCentimeters());
    }

    @Test
    public void testToInches() {
        Length length = Length.ofMeters(1);
        assertEquals(39.3701, length.toInches(), 0.0001);
    }

    @Test
    public void testToFeet() {
        Length length = Length.ofMeters(1);
        assertEquals(3.28084, length.toFeet(), 0.0001);
    }

    @Test
    public void testAdd() {
        Length length1 = Length.ofMeters(1);
        Length length2 = Length.ofMeters(2);
        Length result = length1.add(length2);
        assertEquals(3, result.toMeters());
    }

    @Test
    public void testSubtract() {
        Length length1 = Length.ofMeters(2);
        Length length2 = Length.ofMeters(1);
        Length result = length1.subtract(length2);
        assertEquals(1, result.toMeters());
    }

    @Test
    public void testMultiply() {
        Length length = Length.ofMeters(2);
        Length result = length.multiply(2);
        assertEquals(4, result.toMeters());
    }

    @Test
    public void testDivide() {
        Length length = Length.ofMeters(4);
        Length result = length.divide(2);
        assertEquals(2, result.toMeters());
    }

    @Test
    public void testDivideByZero() {
        Length length = Length.ofMeters(4);
        assertThrows(ArithmeticException.class, () -> length.divide(0));
    }

    @Test
    public void testToString() {
        Length length = Length.ofMeters(1);
        assertEquals("1.0 meters", length.toString());
    }
}
