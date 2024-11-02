package com.github.bgalek.units4j;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DensityTest {

    @Test
    public void testOfKilogramsPerCubicMeter() {
        Density density = Density.ofKilogramsPerCubicMeter(1000);
        assertEquals(1000, density.toKilogramsPerCubicMeter());
    }

    @Test
    public void testOfGramsPerCubicCentimeter() {
        Density density = Density.ofGramsPerCubicCentimeter(1);
        assertEquals(1000, density.toKilogramsPerCubicMeter());
    }

    @Test
    public void testToGramsPerCubicCentimeter() {
        Density density = Density.ofKilogramsPerCubicMeter(1000);
        assertEquals(1, density.toGramsPerCubicCentimeter());
    }

    @Test
    public void testAdd() {
        Density density1 = Density.ofKilogramsPerCubicMeter(500);
        Density density2 = Density.ofKilogramsPerCubicMeter(500);
        Density result = density1.add(density2);
        assertEquals(1000, result.toKilogramsPerCubicMeter());
    }

    @Test
    public void testSubtract() {
        Density density1 = Density.ofKilogramsPerCubicMeter(1000);
        Density density2 = Density.ofKilogramsPerCubicMeter(500);
        Density result = density1.subtract(density2);
        assertEquals(500, result.toKilogramsPerCubicMeter());
    }

    @Test
    public void testMultiply() {
        Density density = Density.ofKilogramsPerCubicMeter(500);
        Density result = density.multiply(2);
        assertEquals(1000, result.toKilogramsPerCubicMeter());
    }

    @Test
    public void testDivide() {
        Density density = Density.ofKilogramsPerCubicMeter(1000);
        Density result = density.divide(2);
        assertEquals(500, result.toKilogramsPerCubicMeter());
    }

    @Test
    public void testDivideByZero() {
        Density density = Density.ofKilogramsPerCubicMeter(1000);
        assertThrows(ArithmeticException.class, () -> density.divide(0));
    }

    @Test
    public void testToString() {
        Density density = Density.ofKilogramsPerCubicMeter(1000);
        assertEquals("1000.00 kg/m³", density.toString());
    }
}
