package com.github.bgalek.units4j;

public final class Force extends BaseUnit<Force, Double> {
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
        return new Force(value * 4.44822);
    }

    public double toNewtons() {
        return this.value;
    }

    public double toKilogramForce() {
        return this.value / Acceleration.GRAVITATIONAL_ACCELERATION;
    }

    public double toPoundForce() {
        return this.value / 4.44822;
    }

    public Force add(Force other) {
        return new Force(this.value + other.value);
    }

    public Force subtract(Force other) {
        return new Force(this.value - other.value);
    }

    public Force multiply(double factor) {
        return new Force(this.value * factor);
    }

    public Force divide(double divisor) {
        if (divisor == 0) throw new ArithmeticException("Cannot divide by zero");
        return new Force(this.value / divisor);
    }

    @Override
    public String toString() {
        return String.format("%.2f N", value);
    }
}
