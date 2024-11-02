package com.github.bgalek.units4j;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AngleTest {

    @Test
    public void testOfDegrees() {
        Angle angle = Angle.ofDegrees(180);
        assertEquals(Math.PI, angle.toRadians());
    }

    @Test
    public void testOfRadians() {
        Angle angle = Angle.ofRadians(Math.PI);
        assertEquals(180, angle.toDegrees());
    }

    @Test
    public void testOfGradians() {
        Angle angle = Angle.ofGradians(200);
        assertEquals(Math.PI, angle.toRadians());
    }

    @Test
    public void testToDegrees() {
        Angle angle = Angle.ofRadians(Math.PI);
        assertEquals(180, angle.toDegrees());
    }

    @Test
    public void testToRadians() {
        Angle angle = Angle.ofDegrees(180);
        assertEquals(Math.PI, angle.toRadians());
    }

    @Test
    public void testToGradians() {
        Angle angle = Angle.ofRadians(Math.PI);
        assertEquals(200, angle.toGradians());
    }

    @Test
    public void testAdd() {
        Angle angle1 = Angle.ofDegrees(90);
        Angle angle2 = Angle.ofDegrees(90);
        Angle result = angle1.add(angle2);
        assertEquals(180, result.toDegrees());
    }

    @Test
    public void testSubtract() {
        Angle angle1 = Angle.ofDegrees(180);
        Angle angle2 = Angle.ofDegrees(90);
        Angle result = angle1.subtract(angle2);
        assertEquals(90, result.toDegrees());
    }

    @Test
    public void testMultiply() {
        Angle angle = Angle.ofDegrees(90);
        Angle result = angle.multiply(2);
        assertEquals(180, result.toDegrees());
    }

    @Test
    public void testDivide() {
        Angle angle = Angle.ofDegrees(180);
        Angle result = angle.divide(2);
        assertEquals(90, result.toDegrees());
    }

    @Test
    public void testDivideByZero() {
        Angle angle = Angle.ofDegrees(180);
        assertThrows(ArithmeticException.class, () -> angle.divide(0));
    }

    @Test
    public void testToString() {
        Angle angle = Angle.ofDegrees(180);
        assertEquals("3.14 radians", angle.toString());
    }
}
