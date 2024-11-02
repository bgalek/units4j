package com.github.bgalek.units4j;

public final class Area extends BaseUnit<Area, Double> {

    public static final double ACRE = 4046.86;

    private Area(double squareMeters) {
        super(squareMeters);
    }

    public static Area ofSquareMeters(double value) {
        return new Area(value);
    }

    public static Area ofSquareKilometers(double value) {
        return new Area(value * 1_000_000);
    }

    public static Area ofSquareFeet(double value) {
        return new Area(value * 0.092903);
    }

    public static Area ofAcres(double value) {
        return new Area(value * ACRE);
    }

    public double toSquareMeters() {
        return this.value;
    }

    public double toSquareKilometers() {
        return this.value / 1_000_000;
    }

    public double toSquareFeet() {
        return this.value / 0.092903;
    }

    public double toAcres() {
        return this.value / ACRE;
    }

    public Area add(Area other) {
        return new Area(this.value + other.value);
    }

    public Area subtract(Area other) {
        return new Area(this.value - other.value);
    }

    public Area multiply(double factor) {
        return new Area(this.value * factor);
    }

    public Area divide(double divisor) {
        if (divisor == 0) throw new ArithmeticException("Cannot divide by zero");
        return new Area(this.value / divisor);
    }

    @Override
    public String toString() {
        return String.format("%.2f m²", value);
    }
}
