package com.github.bgalek.units4j;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SpeedTest {

    @Test
    public void testOfMetersPerSecond() {
        Speed speed = Speed.ofMetersPerSecond(10);
        assertEquals(10, speed.toMetersPerSecond());
    }

    @Test
    public void testOfKilometersPerHour() {
        Speed speed = Speed.ofKilometersPerHour(36);
        assertEquals(10, speed.toMetersPerSecond());
    }

    @Test
    public void testOfMilesPerHour() {
        Speed speed = Speed.ofMilesPerHour(22.3694);
        assertEquals(10, speed.toMetersPerSecond(), 0.0001);
    }

    @Test
    public void testOfKnots() {
        Speed speed = Speed.ofKnots(19.4384);
        assertEquals(10, speed.toMetersPerSecond(), 0.0001);
    }

    @Test
    public void testToKilometersPerHour() {
        Speed speed = Speed.ofMetersPerSecond(10);
        assertEquals(36, speed.toKilometersPerHour());
    }

    @Test
    public void testToMilesPerHour() {
        Speed speed = Speed.ofMetersPerSecond(10);
        assertEquals(22.3694, speed.toMilesPerHour(), 0.0001);
    }

    @Test
    public void testToKnots() {
        Speed speed = Speed.ofMetersPerSecond(10);
        assertEquals(19.4384, speed.toKnots(), 0.0001);
    }

    @Test
    public void testAdd() {
        Speed speed1 = Speed.ofMetersPerSecond(5);
        Speed speed2 = Speed.ofMetersPerSecond(5);
        Speed result = speed1.add(speed2);
        assertEquals(10, result.toMetersPerSecond());
    }

    @Test
    public void testSubtract() {
        Speed speed1 = Speed.ofMetersPerSecond(10);
        Speed speed2 = Speed.ofMetersPerSecond(5);
        Speed result = speed1.subtract(speed2);
        assertEquals(5, result.toMetersPerSecond());
    }

    @Test
    public void testMultiply() {
        Speed speed = Speed.ofMetersPerSecond(5);
        Speed result = speed.multiply(2);
        assertEquals(10, result.toMetersPerSecond());
    }

    @Test
    public void testDivide() {
        Speed speed = Speed.ofMetersPerSecond(10);
        Speed result = speed.divide(2);
        assertEquals(5, result.toMetersPerSecond());
    }

    @Test
    public void testDivideByZero() {
        Speed speed = Speed.ofMetersPerSecond(10);
        assertThrows(ArithmeticException.class, () -> speed.divide(0));
    }

    @Test
    public void testToString() {
        Speed speed = Speed.ofMetersPerSecond(10);
        assertEquals("10.00 m/s", speed.toString());
    }
}
