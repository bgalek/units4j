package com.github.bgalek.units4j;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AreaTest {

    @Test
    public void testOfSquareMeters() {
        Area area = Area.ofSquareMeters(100);
        assertEquals(100, area.toSquareMeters());
    }

    @Test
    public void testOfSquareKilometers() {
        Area area = Area.ofSquareKilometers(1);
        assertEquals(1_000_000, area.toSquareMeters());
    }

    @Test
    public void testOfSquareFeet() {
        Area area = Area.ofSquareFeet(10.7639);
        assertEquals(1, area.toSquareMeters(), 0.0001);
    }

    @Test
    public void testOfAcres() {
        Area area = Area.ofAcres(1);
        assertEquals(4046.86, area.toSquareMeters());
    }

    @Test
    public void testToSquareKilometers() {
        Area area = Area.ofSquareMeters(1_000_000);
        assertEquals(1, area.toSquareKilometers());
    }

    @Test
    public void testToSquareFeet() {
        Area area = Area.ofSquareMeters(1);
        assertEquals(10.7639, area.toSquareFeet(), 0.0001);
    }

    @Test
    public void testToAcres() {
        Area area = Area.ofSquareMeters(4046.86);
        assertEquals(1, area.toAcres());
    }

    @Test
    public void testAdd() {
        Area area1 = Area.ofSquareMeters(50);
        Area area2 = Area.ofSquareMeters(50);
        Area result = area1.add(area2);
        assertEquals(100, result.toSquareMeters());
    }

    @Test
    public void testSubtract() {
        Area area1 = Area.ofSquareMeters(100);
        Area area2 = Area.ofSquareMeters(50);
        Area result = area1.subtract(area2);
        assertEquals(50, result.toSquareMeters());
    }

    @Test
    public void testMultiply() {
        Area area = Area.ofSquareMeters(50);
        Area result = area.multiply(2);
        assertEquals(100, result.toSquareMeters());
    }

    @Test
    public void testDivide() {
        Area area = Area.ofSquareMeters(100);
        Area result = area.divide(2);
        assertEquals(50, result.toSquareMeters());
    }

    @Test
    public void testDivideByZero() {
        Area area = Area.ofSquareMeters(100);
        assertThrows(ArithmeticException.class, () -> area.divide(0));
    }

    @Test
    public void testToString() {
        Area area = Area.ofSquareMeters(100);
        assertEquals("100.00 m²", area.toString());
    }
}
