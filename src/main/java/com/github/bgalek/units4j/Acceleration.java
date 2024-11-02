package com.github.bgalek.units4j;

public final class Acceleration extends BaseUnit<Acceleration, Double> {
    public static final double GRAVITATIONAL_ACCELERATION = 9.80665;

    private Acceleration(double metersPerSecondSquared) {
        super(metersPerSecondSquared);
    }

    public static Acceleration ofMetersPerSecondSquared(double value) {
        return new Acceleration(value);
    }

    public static Acceleration ofGravity(double g) {
        return new Acceleration(g * GRAVITATIONAL_ACCELERATION);
    }

    public double toMetersPerSecondSquared() {
        return value;
    }

    public double toGravity() {
        return value / GRAVITATIONAL_ACCELERATION;
    }

    @Override
    public Acceleration add(Acceleration other) {
        return new Acceleration(this.value + other.value);
    }

    @Override
    public Acceleration subtract(Acceleration other) {
        return new Acceleration(this.value - other.value);
    }

    @Override
    public Acceleration multiply(double factor) {
        return new Acceleration(this.value * factor);
    }

    @Override
    public Acceleration divide(double divisor) {
        if (divisor == 0) throw new ArithmeticException("Cannot divide by zero");
        return new Acceleration(this.value / divisor);
    }

    @Override
    public String toString() {
        return String.format("%.2f m/s²", value);
    }
}
