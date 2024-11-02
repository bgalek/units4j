package com.github.bgalek.units4j;

public final class Force extends BaseUnit<Force, Double> {

    public static final double POUND_FORCE = 4.44822;

    private Force(double newtons) {
        super(newtons);
    }

    public static Force ofNewtons(double value) {
        return new Force(value);
    }

    public static Force ofKilogramForce(double value) {
        return new Force(value * Acceleration.GRAVITATIONAL_ACCELERATION);
    }

    public static Force ofPoundForce(double value) {
        return new Force(value * POUND_FORCE);
    }

    public double toNewtons() {
        return this.value;
    }

    public double toKilogramForce() {
        return this.value / Acceleration.GRAVITATIONAL_ACCELERATION;
    }

    public double toPoundForce() {
        return this.value / POUND_FORCE;
    }

    @Override
    public Force add(Force other) {
        return new Force(this.value + other.value);
    }

    @Override
    public Force subtract(Force other) {
        return new Force(this.value - other.value);
    }

    @Override
    public Force multiply(double factor) {
        return new Force(this.value * factor);
    }

    @Override
    public Force divide(double divisor) {
        if (divisor == 0) throw new ArithmeticException("Cannot divide by zero");
        return new Force(this.value / divisor);
    }

    @Override
    public String toString() {
        return String.format("%.2f N", value);
    }
}
