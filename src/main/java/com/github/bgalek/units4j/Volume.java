package com.github.bgalek.units4j;

public final class Volume extends BaseUnit<Volume, Double> {
    private Volume(double liters) {
        super(liters);
    }

    public static Volume ofLiters(double value) {
        return new Volume(value);
    }

    public static Volume ofMilliliters(double value) {
        return new Volume(value / 1000);
    }

    public static Volume ofCubicMeters(double value) {
        return new Volume(value * 1000);
    }

    public static Volume ofCubicCentimeters(double value) {
        return new Volume(value / 1000);
    }

    // Conversion methods
    public double toLiters() {
        return this.value;
    }

    public double toMilliliters() {
        return this.value * 1000;
    }

    public double toCubicMeters() {
        return this.value / 1000;
    }

    public double toCubicCentimeters() {
        return this.value * 1000;
    }

    // Arithmetic operations
    public Volume add(Volume other) {
        return new Volume(this.value + other.value);
    }

    public Volume subtract(Volume other) {
        return new Volume(this.value - other.value);
    }

    public Volume multiply(double factor) {
        return new Volume(this.value * factor);
    }

    public Volume divide(double divisor) {
        if (divisor == 0) throw new ArithmeticException("Cannot divide by zero");
        return new Volume(this.value / divisor);
    }

    @Override
    public String toString() {
        return String.format("%.2f liters", value);
    }
}
