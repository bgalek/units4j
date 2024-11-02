package com.github.bgalek.units4j;

public final class Energy extends BaseUnit<Energy, Double> {

    private Energy(double joules) {
        super(joules);
    }

    public static Energy ofJoules(double value) {
        return new Energy(value);
    }

    public static Energy ofKilojoules(double value) {
        return new Energy(value * 1000);
    }

    public static Energy ofCalories(double value) {
        return new Energy(value * 4.184);
    }

    public static Energy ofWattHours(double value) {
        return new Energy(value * 3600);
    }

    public double toJoules() {
        return this.value;
    }

    public double toKilojoules() {
        return this.value / 1000;
    }

    public double toCalories() {
        return this.value / 4.184;
    }

    public double toWattHours() {
        return this.value / 3600;
    }

    @Override
    public Energy add(Energy other) {
        return new Energy(this.value + other.value);
    }

    @Override
    public Energy subtract(Energy other) {
        return new Energy(this.value - other.value);
    }

    @Override
    public Energy multiply(double factor) {
        return new Energy(this.value * factor);
    }

    @Override
    public Energy divide(double divisor) {
        if (divisor == 0) throw new ArithmeticException("Cannot divide by zero");
        return new Energy(this.value / divisor);
    }

    @Override
    public String toString() {
        return String.format("%.2f J", value);
    }
}
