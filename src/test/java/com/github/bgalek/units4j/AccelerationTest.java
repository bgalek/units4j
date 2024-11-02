package com.github.bgalek.units4j;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AccelerationTest {

    @Test
    public void testOfMetersPerSecondSquared() {
        Acceleration acceleration = Acceleration.ofMetersPerSecondSquared(9.8);
        assertEquals(9.8, acceleration.toMetersPerSecondSquared());
    }

    @Test
    public void testOfGravity() {
        Acceleration acceleration = Acceleration.ofGravity(1);
        assertEquals(9.80665, acceleration.toMetersPerSecondSquared());
    }

    @Test
    public void testToGravity() {
        Acceleration acceleration = Acceleration.ofMetersPerSecondSquared(9.80665);
        assertEquals(1, acceleration.toGravity());
    }

    @Test
    public void testAdd() {
        Acceleration acceleration1 = Acceleration.ofMetersPerSecondSquared(5);
        Acceleration acceleration2 = Acceleration.ofMetersPerSecondSquared(3);
        Acceleration result = acceleration1.add(acceleration2);
        assertEquals(8, result.toMetersPerSecondSquared());
    }

    @Test
    public void testSubtract() {
        Acceleration acceleration1 = Acceleration.ofMetersPerSecondSquared(5);
        Acceleration acceleration2 = Acceleration.ofMetersPerSecondSquared(3);
        Acceleration result = acceleration1.subtract(acceleration2);
        assertEquals(2, result.toMetersPerSecondSquared());
    }

    @Test
    public void testMultiply() {
        Acceleration acceleration = Acceleration.ofMetersPerSecondSquared(5);
        Acceleration result = acceleration.multiply(2);
        assertEquals(10, result.toMetersPerSecondSquared());
    }

    @Test
    public void testDivide() {
        Acceleration acceleration = Acceleration.ofMetersPerSecondSquared(10);
        Acceleration result = acceleration.divide(2);
        assertEquals(5, result.toMetersPerSecondSquared());
    }

    @Test
    public void testDivideByZero() {
        Acceleration acceleration = Acceleration.ofMetersPerSecondSquared(10);
        assertThrows(ArithmeticException.class, () -> acceleration.divide(0));
    }

    @Test
    public void testToString() {
        Acceleration acceleration = Acceleration.ofMetersPerSecondSquared(9.8);
        assertEquals("9.80 m/s²", acceleration.toString());
    }
}
