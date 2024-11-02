package com.github.bgalek.units4j;

public final class Temperature extends BaseUnit<Temperature, Double> {

    private Temperature(double kelvin) {
        super(kelvin);
    }

    public static Temperature ofCelsius(double value) {
        return new Temperature(value + 273.15);
    }

    public static Temperature ofFahrenheit(double value) {
        return new Temperature((value - 32) * 5 / 9 + 273.15);
    }

    public static Temperature ofKelvin(double value) {
        return new Temperature(value);
    }

    public double toCelsius() {
        return this.value - 273.15;
    }

    public double toFahrenheit() {
        return (this.value - 273.15) * 9 / 5 + 32;
    }

    public double toKelvin() {
        return this.value;
    }

    @Override
    public Temperature add(Temperature other) {
        return new Temperature(this.value + other.value);
    }

    @Override
    public Temperature subtract(Temperature other) {
        return new Temperature(this.value - other.value);
    }

    @Override
    public Temperature multiply(double factor) {
        return new Temperature(this.value * factor);
    }

    @Override
    public Temperature divide(double divisor) {
        if (divisor == 0) throw new ArithmeticException("Cannot divide by zero");
        return new Temperature(this.value / divisor);
    }

    @Override
    public String toString() {
        return String.format("%.2f K", value);
    }
}
