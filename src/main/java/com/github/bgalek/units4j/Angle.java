package com.github.bgalek.units4j;

public final class Angle extends BaseUnit<Angle, Double> {
    private Angle(double radians) {
        super(radians);
    }

    public static Angle ofDegrees(double value) {
        return new Angle(Math.toRadians(value));
    }

    public static Angle ofRadians(double value) {
        return new Angle(value);
    }

    public static Angle ofGradians(double value) {
        return new Angle(value * Math.PI / 200);
    }

    public double toDegrees() {
        return Math.toDegrees(value);
    }

    public double toRadians() {
        return value;
    }

    public double toGradians() {
        return value * 200 / Math.PI;
    }

    @Override
    public Angle add(Angle other) {
        return new Angle(this.value + other.value);
    }

    @Override
    public Angle subtract(Angle other) {
        return new Angle(this.value - other.value);
    }

    @Override
    public Angle multiply(double factor) {
        return new Angle(this.value * factor);
    }

    @Override
    public Angle divide(double divisor) {
        if (divisor == 0) throw new ArithmeticException("Cannot divide by zero");
        return new Angle(this.value / divisor);
    }

    @Override
    public String toString() {
        return String.format("%.2f radians", value);
    }
}
