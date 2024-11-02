package com.github.bgalek.units4j;

public final class Density extends BaseUnit<Density, Double> {

    private Density(double kilogramsPerCubicMeter) {
        super(kilogramsPerCubicMeter);
    }

    public static Density ofKilogramsPerCubicMeter(double value) {
        return new Density(value);
    }

    public static Density ofGramsPerCubicCentimeter(double value) {
        return new Density(value * 1000);
    }

    public double toKilogramsPerCubicMeter() {
        return this.value;
    }

    public double toGramsPerCubicCentimeter() {
        return this.value / 1000;
    }

    @Override
    public Density add(Density other) {
        return new Density(this.value + other.value);
    }

    @Override
    public Density subtract(Density other) {
        return new Density(this.value - other.value);
    }

    @Override
    public Density multiply(double factor) {
        return new Density(this.value * factor);
    }

    @Override
    public Density divide(double divisor) {
        if (divisor == 0) throw new ArithmeticException("Cannot divide by zero");
        return new Density(this.value / divisor);
    }

    @Override
    public String toString() {
        return String.format("%.2f kg/m³", value);
    }
}
