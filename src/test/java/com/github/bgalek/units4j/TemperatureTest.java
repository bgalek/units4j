package com.github.bgalek.units4j;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TemperatureTest {

    @Test
    public void testOfCelsius() {
        Temperature temperature = Temperature.ofCelsius(25);
        assertEquals(298.15, temperature.toKelvin());
    }

    @Test
    public void testOfFahrenheit() {
        Temperature temperature = Temperature.ofFahrenheit(77);
        assertEquals(298.15, temperature.toKelvin());
    }

    @Test
    public void testOfKelvin() {
        Temperature temperature = Temperature.ofKelvin(298.15);
        assertEquals(298.15, temperature.toKelvin());
    }

    @Test
    public void testToCelsius() {
        Temperature temperature = Temperature.ofKelvin(298.15);
        assertEquals(25, temperature.toCelsius());
    }

    @Test
    public void testToFahrenheit() {
        Temperature temperature = Temperature.ofKelvin(298.15);
        assertEquals(77, temperature.toFahrenheit());
    }

    @Test
    public void testAdd() {
        Temperature temperature1 = Temperature.ofKelvin(298.15);
        Temperature temperature2 = Temperature.ofKelvin(1);
        Temperature result = temperature1.add(temperature2);
        assertEquals(299.15, result.toKelvin());
    }

    @Test
    public void testSubtract() {
        Temperature temperature1 = Temperature.ofKelvin(298.15);
        Temperature temperature2 = Temperature.ofKelvin(1);
        Temperature result = temperature1.subtract(temperature2);
        assertEquals(297.15, result.toKelvin());
    }

    @Test
    public void testMultiply() {
        Temperature temperature = Temperature.ofKelvin(298.15);
        Temperature result = temperature.multiply(2);
        assertEquals(596.3, result.toKelvin());
    }

    @Test
    public void testDivide() {
        Temperature temperature = Temperature.ofKelvin(298.15);
        Temperature result = temperature.divide(2);
        assertEquals(149.075, result.toKelvin());
    }

    @Test
    public void testDivideByZero() {
        Temperature temperature = Temperature.ofKelvin(298.15);
        assertThrows(ArithmeticException.class, () -> temperature.divide(0));
    }

    @Test
    public void testToString() {
        Temperature temperature = Temperature.ofKelvin(298.15);
        assertEquals("298.15 K", temperature.toString());
    }
}
