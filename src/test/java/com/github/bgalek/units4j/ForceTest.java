package com.github.bgalek.units4j;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ForceTest {

    @Test
    public void testOfNewtons() {
        Force force = Force.ofNewtons(10);
        assertEquals(10, force.toNewtons());
    }

    @Test
    public void testOfKilogramForce() {
        Force force = Force.ofKilogramForce(1);
        assertEquals(9.80665, force.toNewtons());
    }

    @Test
    public void testOfPoundForce() {
        Force force = Force.ofPoundForce(1);
        assertEquals(4.44822, force.toNewtons());
    }

    @Test
    public void testToKilogramForce() {
        Force force = Force.ofNewtons(9.80665);
        assertEquals(1, force.toKilogramForce());
    }

    @Test
    public void testToPoundForce() {
        Force force = Force.ofNewtons(4.44822);
        assertEquals(1, force.toPoundForce());
    }

    @Test
    public void testAdd() {
        Force force1 = Force.ofNewtons(5);
        Force force2 = Force.ofNewtons(3);
        Force result = force1.add(force2);
        assertEquals(8, result.toNewtons());
    }

    @Test
    public void testSubtract() {
        Force force1 = Force.ofNewtons(5);
        Force force2 = Force.ofNewtons(3);
        Force result = force1.subtract(force2);
        assertEquals(2, result.toNewtons());
    }

    @Test
    public void testMultiply() {
        Force force = Force.ofNewtons(5);
        Force result = force.multiply(2);
        assertEquals(10, result.toNewtons());
    }

    @Test
    public void testDivide() {
        Force force = Force.ofNewtons(10);
        Force result = force.divide(2);
        assertEquals(5, result.toNewtons());
    }

    @Test
    public void testDivideByZero() {
        Force force = Force.ofNewtons(10);
        assertThrows(ArithmeticException.class, () -> force.divide(0));
    }

    @Test
    public void testToString() {
        Force force = Force.ofNewtons(10);
        assertEquals("10.00 N", force.toString());
    }
}
