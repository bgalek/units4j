package com.github.bgalek.units4j;

public final class Pressure extends BaseUnit<Pressure, Double> {
    private Pressure(double pascals) {
        super(pascals);
    }

    public static Pressure ofPascals(double value) {
        return new Pressure(value);
    }

    public static Pressure ofBars(double value) {
        return new Pressure(value * 100000);
    }

    public static Pressure ofAtmospheres(double value) {
        return new Pressure(value * 101325);
    }

    public static Pressure ofPsi(double value) {
        return new Pressure(value * 6894.76);
    }

    public double toPascals() {
        return this.value;
    }

    public double toBars() {
        return this.value / 100000;
    }

    public double toAtmospheres() {
        return this.value / 101325;
    }

    public double toPsi() {
        return this.value / 6894.76;
    }

    public Pressure add(Pressure other) {
        return new Pressure(this.value + other.value);
    }

    public Pressure subtract(Pressure other) {
        return new Pressure(this.value - other.value);
    }

    @Override
    public Pressure multiply(double factor) {
        return new Pressure(this.value * factor);
    }

    @Override
    public Pressure divide(double divisor) {
        if (divisor == 0) throw new ArithmeticException("Cannot divide by zero");
        return new Pressure(value / divisor);
    }

    @Override
    public String toString() {
        return String.format("%.2f Pa", value);
    }
}
