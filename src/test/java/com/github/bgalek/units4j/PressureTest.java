package com.github.bgalek.units4j;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PressureTest {

    @Test
    public void testOfPascals() {
        Pressure pressure = Pressure.ofPascals(101325);
        assertEquals(101325, pressure.toPascals());
    }

    @Test
    public void testOfBars() {
        Pressure pressure = Pressure.ofBars(1);
        assertEquals(100000, pressure.toPascals());
    }

    @Test
    public void testOfAtmospheres() {
        Pressure pressure = Pressure.ofAtmospheres(1);
        assertEquals(101325, pressure.toPascals());
    }

    @Test
    public void testOfPsi() {
        Pressure pressure = Pressure.ofPsi(1);
        assertEquals(6894.76, pressure.toPascals(), 0.01);
    }

    @Test
    public void testToBars() {
        Pressure pressure = Pressure.ofPascals(100000);
        assertEquals(1, pressure.toBars());
    }

    @Test
    public void testToAtmospheres() {
        Pressure pressure = Pressure.ofPascals(101325);
        assertEquals(1, pressure.toAtmospheres());
    }

    @Test
    public void testToPsi() {
        Pressure pressure = Pressure.ofPascals(6894.76);
        assertEquals(1, pressure.toPsi(), 0.01);
    }

    @Test
    public void testAdd() {
        Pressure pressure1 = Pressure.ofPascals(50000);
        Pressure pressure2 = Pressure.ofPascals(50000);
        Pressure result = pressure1.add(pressure2);
        assertEquals(100000, result.toPascals());
    }

    @Test
    public void testSubtract() {
        Pressure pressure1 = Pressure.ofPascals(100000);
        Pressure pressure2 = Pressure.ofPascals(50000);
        Pressure result = pressure1.subtract(pressure2);
        assertEquals(50000, result.toPascals());
    }

    @Test
    public void testMultiply() {
        Pressure pressure = Pressure.ofPascals(50000);
        Pressure result = pressure.multiply(2);
        assertEquals(100000, result.toPascals());
    }

    @Test
    public void testDivide() {
        Pressure pressure = Pressure.ofPascals(100000);
        Pressure result = pressure.divide(2);
        assertEquals(50000, result.toPascals());
    }

    @Test
    public void testDivideByZero() {
        Pressure pressure = Pressure.ofPascals(100000);
        assertThrows(ArithmeticException.class, () -> pressure.divide(0));
    }

    @Test
    public void testToString() {
        Pressure pressure = Pressure.ofPascals(101325);
        assertEquals("101325.00 Pa", pressure.toString());
    }
}
