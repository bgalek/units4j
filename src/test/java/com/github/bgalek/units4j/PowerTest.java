package com.github.bgalek.units4j;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PowerTest {

    @Test
    public void testOfWatts() {
        Power power = Power.ofWatts(100);
        assertEquals(100, power.toWatts());
    }

    @Test
    public void testOfKilowatts() {
        Power power = Power.ofKilowatts(1);
        assertEquals(1000, power.toWatts());
    }

    @Test
    public void testOfHorsepower() {
        Power power = Power.ofHorsepower(1);
        assertEquals(745.7, power.toWatts());
    }

    @Test
    public void testToKilowatts() {
        Power power = Power.ofWatts(1000);
        assertEquals(1, power.toKilowatts());
    }

    @Test
    public void testToHorsepower() {
        Power power = Power.ofWatts(745.7);
        assertEquals(1, power.toHorsepower());
    }

    @Test
    public void testAdd() {
        Power power1 = Power.ofWatts(50);
        Power power2 = Power.ofWatts(50);
        Power result = power1.add(power2);
        assertEquals(100, result.toWatts());
    }

    @Test
    public void testSubtract() {
        Power power1 = Power.ofWatts(100);
        Power power2 = Power.ofWatts(50);
        Power result = power1.subtract(power2);
        assertEquals(50, result.toWatts());
    }

    @Test
    public void testMultiply() {
        Power power = Power.ofWatts(50);
        Power result = power.multiply(2);
        assertEquals(100, result.toWatts());
    }

    @Test
    public void testDivide() {
        Power power = Power.ofWatts(100);
        Power result = power.divide(2);
        assertEquals(50, result.toWatts());
    }

    @Test
    public void testDivideByZero() {
        Power power = Power.ofWatts(100);
        assertThrows(ArithmeticException.class, () -> power.divide(0));
    }

    @Test
    public void testToString() {
        Power power = Power.ofWatts(100);
        assertEquals("100.00 W", power.toString());
    }
}
