package com.github.bgalek.units4j;

public final class Power extends BaseUnit<Power, Double> {

    private Power(double watts) {
        super(watts);
    }

    public static Power ofWatts(double watts) {
        return new Power(watts);
    }

    public static Power ofKilowatts(double kilowatts) {
        return new Power(kilowatts * 1000);
    }

    public static Power ofHorsepower(double horsepower) {
        return new Power(horsepower * 745.7);
    }

    public double toWatts() {
        return this.value;
    }

    public double toKilowatts() {
        return this.value / 1000;
    }

    public double toHorsepower() {
        return this.value / 745.7;
    }

    @Override
    public Power add(Power other) {
        return new Power(this.value + other.value);
    }

    @Override
    public Power subtract(Power other) {
        return new Power(this.value - other.value);
    }

    @Override
    public Power multiply(double factor) {
        return new Power(this.value * factor);
    }

    @Override
    public Power divide(double divisor) {
        if (divisor == 0) throw new ArithmeticException("Cannot divide by zero");
        return new Power(this.value / divisor);
    }

    @Override
    public String toString() {
        return String.format("%.2f W", value);
    }
}
