package com.github.bgalek.units4j;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FrequencyTest {

    @Test
    public void testOfHertz() {
        Frequency frequency = Frequency.ofHertz(1000);
        assertEquals(1000, frequency.toHertz());
    }

    @Test
    public void testOfKilohertz() {
        Frequency frequency = Frequency.ofKilohertz(1);
        assertEquals(1000, frequency.toHertz());
    }

    @Test
    public void testOfMegahertz() {
        Frequency frequency = Frequency.ofMegahertz(1);
        assertEquals(1_000_000, frequency.toHertz());
    }

    @Test
    public void testOfGigahertz() {
        Frequency frequency = Frequency.ofGigahertz(1);
        assertEquals(1_000_000_000, frequency.toHertz());
    }

    @Test
    public void testToKilohertz() {
        Frequency frequency = Frequency.ofHertz(1000);
        assertEquals(1, frequency.toKilohertz());
    }

    @Test
    public void testToMegahertz() {
        Frequency frequency = Frequency.ofHertz(1_000_000);
        assertEquals(1, frequency.toMegahertz());
    }

    @Test
    public void testToGigahertz() {
        Frequency frequency = Frequency.ofHertz(1_000_000_000);
        assertEquals(1, frequency.toGigahertz());
    }

    @Test
    public void testAdd() {
        Frequency frequency1 = Frequency.ofHertz(500);
        Frequency frequency2 = Frequency.ofHertz(500);
        Frequency result = frequency1.add(frequency2);
        assertEquals(1000, result.toHertz());
    }

    @Test
    public void testSubtract() {
        Frequency frequency1 = Frequency.ofHertz(1000);
        Frequency frequency2 = Frequency.ofHertz(500);
        Frequency result = frequency1.subtract(frequency2);
        assertEquals(500, result.toHertz());
    }

    @Test
    public void testMultiply() {
        Frequency frequency = Frequency.ofHertz(500);
        Frequency result = frequency.multiply(2);
        assertEquals(1000, result.toHertz());
    }

    @Test
    public void testDivide() {
        Frequency frequency = Frequency.ofHertz(1000);
        Frequency result = frequency.divide(2);
        assertEquals(500, result.toHertz());
    }

    @Test
    public void testDivideByZero() {
        Frequency frequency = Frequency.ofHertz(1000);
        assertThrows(ArithmeticException.class, () -> frequency.divide(0));
    }

    @Test
    public void testToString() {
        Frequency frequency = Frequency.ofHertz(1000);
        assertEquals("1000.00 Hz", frequency.toString());
    }
}
