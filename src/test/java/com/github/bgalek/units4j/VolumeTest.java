package com.github.bgalek.units4j;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class VolumeTest {

    @Test
    public void testOfLiters() {
        Volume volume = Volume.ofLiters(1);
        assertEquals(1, volume.toLiters());
    }

    @Test
    public void testOfMilliliters() {
        Volume volume = Volume.ofMilliliters(1000);
        assertEquals(1, volume.toLiters());
    }

    @Test
    public void testOfCubicMeters() {
        Volume volume = Volume.ofCubicMeters(1);
        assertEquals(1000, volume.toLiters());
    }

    @Test
    public void testOfCubicCentimeters() {
        Volume volume = Volume.ofCubicCentimeters(1000);
        assertEquals(1, volume.toLiters());
    }

    @Test
    public void testToMilliliters() {
        Volume volume = Volume.ofLiters(1);
        assertEquals(1000, volume.toMilliliters());
    }

    @Test
    public void testToCubicMeters() {
        Volume volume = Volume.ofLiters(1000);
        assertEquals(1, volume.toCubicMeters());
    }

    @Test
    public void testToCubicCentimeters() {
        Volume volume = Volume.ofLiters(1);
        assertEquals(1000, volume.toCubicCentimeters());
    }

    @Test
    public void testAdd() {
        Volume volume1 = Volume.ofLiters(1);
        Volume volume2 = Volume.ofLiters(2);
        Volume result = volume1.add(volume2);
        assertEquals(3, result.toLiters());
    }

    @Test
    public void testSubtract() {
        Volume volume1 = Volume.ofLiters(3);
        Volume volume2 = Volume.ofLiters(1);
        Volume result = volume1.subtract(volume2);
        assertEquals(2, result.toLiters());
    }

    @Test
    public void testMultiply() {
        Volume volume = Volume.ofLiters(2);
        Volume result = volume.multiply(2);
        assertEquals(4, result.toLiters());
    }

    @Test
    public void testDivide() {
        Volume volume = Volume.ofLiters(4);
        Volume result = volume.divide(2);
        assertEquals(2, result.toLiters());
    }

    @Test
    public void testDivideByZero() {
        Volume volume = Volume.ofLiters(4);
        assertThrows(ArithmeticException.class, () -> volume.divide(0));
    }

    @Test
    public void testToString() {
        Volume volume = Volume.ofLiters(1);
        assertEquals("1.00 liters", volume.toString());
    }
}
