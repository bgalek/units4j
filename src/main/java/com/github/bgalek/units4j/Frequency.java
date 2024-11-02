package com.github.bgalek.units4j;

public final class Frequency extends BaseUnit<Frequency, Double> {

    private Frequency(double hertz) {
        super(hertz);
    }

    public static Frequency ofHertz(double value) {
        return new Frequency(value);
    }

    public static Frequency ofKilohertz(double value) {
        return new Frequency(value * 1000);
    }

    public static Frequency ofMegahertz(double value) {
        return new Frequency(value * 1000 * 1000);
    }

    public static Frequency ofGigahertz(double value) {
        return new Frequency(value * 1000 * 1000 * 1000);
    }

    public double toHertz() {
        return this.value;
    }

    public double toKilohertz() {
        return this.value / 1000;
    }

    public double toMegahertz() {
        return this.value / (1000 * 1000);
    }

    public double toGigahertz() {
        return this.value / (1000 * 1000 * 1000);
    }

    // Arithmetic operations
    public Frequency add(Frequency other) {
        return new Frequency(this.value + other.value);
    }

    public Frequency subtract(Frequency other) {
        return new Frequency(this.value - other.value);
    }

    public Frequency multiply(double factor) {
        return new Frequency(this.value * factor);
    }

    public Frequency divide(double divisor) {
        if (divisor == 0) throw new ArithmeticException("Cannot divide by zero");
        return new Frequency(this.value / divisor);
    }

    @Override
    public String toString() {
        return String.format("%.2f Hz", value);
    }
}
