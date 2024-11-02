package com.github.bgalek.units4j;

public final class Mass extends BaseUnit<Mass, Double> {
    private Mass(double grams) {
        super(grams);
    }

    public static Mass ofGrams(double value) {
        return new Mass(value);
    }

    public static Mass ofKilograms(double value) {
        return new Mass(value * 1000);
    }

    public static Mass ofPounds(double value) {
        return new Mass(value * 453.59237);
    }

    public static Mass ofOunces(double value) {
        return new Mass(value * 28.34952);
    }

    public double toGrams() {
        return this.value;
    }

    public double toKilograms() {
        return this.value / 1000;
    }

    public double toPounds() {
        return this.value / 453.59237;
    }

    public double toOunces() {
        return this.value / 28.34952;
    }

    public Mass add(Mass other) {
        return new Mass(this.value + other.value);
    }

    public Mass subtract(Mass other) {
        return new Mass(this.value - other.value);
    }

    @Override
    public Mass multiply(double factor) {
        return new Mass(this.value * factor);
    }

    @Override
    public Mass divide(double divisor) {
        if (divisor == 0) throw new ArithmeticException("Cannot divide by zero");
        return new Mass(this.value / divisor);
    }

    @Override
    public String toString() {
        return String.format("%.2f grams", this.value);
    }
}
