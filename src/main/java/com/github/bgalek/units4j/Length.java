package com.github.bgalek.units4j;

public final class Length extends BaseUnit<Length, Double> {

    public static final double FEET = 0.3048;

    private Length(double meters) {
        super(meters);
    }

    public static Length ofMeters(double value) {
        return new Length(value);
    }

    public static Length ofKilometers(double value) {
        return new Length(value * 1000);
    }

    public static Length ofCentimeters(double value) {
        return new Length(value / 100);
    }

    public static Length ofInches(double value) {
        return new Length(value * 0.0254);
    }

    public static Length ofFeet(double value) {
        return new Length(value * FEET);
    }

    public double toMeters() {
        return this.value;
    }

    public double toKilometers() {
        return this.value / 1000;
    }

    public double toCentimeters() {
        return this.value * 100;
    }

    public double toInches() {
        return this.value / 0.0254;
    }

    public double toFeet() {
        return this.value / FEET;
    }

    public Length add(Length other) {
        return new Length(this.value + other.value);
    }

    public Length subtract(Length other) {
        return new Length(this.value - other.value);
    }

    public Length multiply(double factor) {
        return new Length(this.value * factor);
    }

    public Length divide(double divisor) {
        if (divisor == 0) throw new ArithmeticException("Cannot divide by zero");
        return new Length(this.value / divisor);
    }

    @Override
    public String toString() {
        return String.format("%s meters", this.value);
    }
}
