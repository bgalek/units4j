package com.github.bgalek.units4j;

public final class Speed extends BaseUnit<Speed, Double> {

    private Speed(double metersPerSecond) {
        super(metersPerSecond);
    }

    public static Speed ofMetersPerSecond(double value) {
        return new Speed(value);
    }

    public static Speed ofKilometersPerHour(double value) {
        return new Speed(value / 3.6);
    }

    public static Speed ofMilesPerHour(double value) {
        return new Speed(value * 0.44704);
    }

    public static Speed ofKnots(double value) {
        return new Speed(value * 0.514444);
    }

    public double toMetersPerSecond() {
        return this.value;
    }

    public double toKilometersPerHour() {
        return this.value * 3.6;
    }

    public double toMilesPerHour() {
        return this.value / 0.44704;
    }

    public double toKnots() {
        return this.value / 0.514444;
    }

    @Override
    public Speed add(Speed other) {
        return new Speed(this.value + other.value);
    }

    @Override
    public Speed subtract(Speed other) {
        return new Speed(this.value - other.value);
    }

    @Override
    public Speed multiply(double factor) {
        return new Speed(this.value * factor);
    }

    @Override
    public Speed divide(double divisor) {
        if (divisor == 0) throw new ArithmeticException("Cannot divide by zero");
        return new Speed(this.value / divisor);
    }

    @Override
    public String toString() {
        return String.format("%.2f m/s", value);
    }
}
