package com.github.bgalek.units4j;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EnergyTest {

    @Test
    public void testOfJoules() {
        Energy energy = Energy.ofJoules(1000);
        assertEquals(1000, energy.toJoules());
    }

    @Test
    public void testOfKilojoules() {
        Energy energy = Energy.ofKilojoules(1);
        assertEquals(1000, energy.toJoules());
    }

    @Test
    public void testOfCalories() {
        Energy energy = Energy.ofCalories(1);
        assertEquals(4.184, energy.toJoules());
    }

    @Test
    public void testOfWattHours() {
        Energy energy = Energy.ofWattHours(1);
        assertEquals(3600, energy.toJoules());
    }

    @Test
    public void testToKilojoules() {
        Energy energy = Energy.ofJoules(1000);
        assertEquals(1, energy.toKilojoules());
    }

    @Test
    public void testToCalories() {
        Energy energy = Energy.ofJoules(4.184);
        assertEquals(1, energy.toCalories());
    }

    @Test
    public void testToWattHours() {
        Energy energy = Energy.ofJoules(3600);
        assertEquals(1, energy.toWattHours());
    }

    @Test
    public void testAdd() {
        Energy energy1 = Energy.ofJoules(500);
        Energy energy2 = Energy.ofJoules(500);
        Energy result = energy1.add(energy2);
        assertEquals(1000, result.toJoules());
    }

    @Test
    public void testSubtract() {
        Energy energy1 = Energy.ofJoules(1000);
        Energy energy2 = Energy.ofJoules(500);
        Energy result = energy1.subtract(energy2);
        assertEquals(500, result.toJoules());
    }

    @Test
    public void testMultiply() {
        Energy energy = Energy.ofJoules(500);
        Energy result = energy.multiply(2);
        assertEquals(1000, result.toJoules());
    }

    @Test
    public void testDivide() {
        Energy energy = Energy.ofJoules(1000);
        Energy result = energy.divide(2);
        assertEquals(500, result.toJoules());
    }

    @Test
    public void testDivideByZero() {
        Energy energy = Energy.ofJoules(1000);
        assertThrows(ArithmeticException.class, () -> energy.divide(0));
    }

    @Test
    public void testToString() {
        Energy energy = Energy.ofJoules(1000);
        assertEquals("1000.00 J", energy.toString());
    }
}
