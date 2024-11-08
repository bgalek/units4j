package com.github.bgalek.units4j;

public final class Area extends BaseUnit<Area, Double> {

    public static final double ACRE = 4046.86;
    public static final double SQUARE_FEET = 0.092903;

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
        return new Area(value * SQUARE_FEET);
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
        return this.value / SQUARE_FEET;
    }

    public double toAcres() {
        return this.value / ACRE;
    }

    @Override
    public Area add(Area other) {
        return new Area(this.value + other.value);
    }

    @Override
    public Area subtract(Area other) {
        return new Area(this.value - other.value);
    }

    @Override
    public Area multiply(double factor) {
        return new Area(this.value * factor);
    }

    @Override
    public Area divide(double divisor) {
        if (divisor == 0) throw new ArithmeticException("Cannot divide by zero");
        return new Area(this.value / divisor);
    }

    @Override
    public String toString() {
        return String.format("%.2f m²", value);
    }
}
