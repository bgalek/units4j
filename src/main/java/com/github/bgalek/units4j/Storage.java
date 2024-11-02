package com.github.bgalek.units4j;

public final class Storage extends BaseUnit<Storage, Long> {

    private Storage(long bytes) {
        super(bytes);
    }

    public static Storage ofBytes(long value) {
        return new Storage(value);
    }

    public static Storage ofKilobytes(double value) {
        return new Storage((long) (value * 1024));
    }

    public static Storage ofMegabytes(double value) {
        return new Storage((long) (value * 1024 * 1024));
    }

    public static Storage ofGigabytes(double value) {
        return new Storage((long) (value * 1024 * 1024 * 1024));
    }

    public static Storage ofTerabytes(double value) {
        return new Storage((long) (value * 1024 * 1024 * 1024 * 1024));
    }

    public long toBytes() {
        return value;
    }

    public double toKilobytes() {
        return this.value / 1024.0;
    }

    public double toMegabytes() {
        return this.value / (1024.0 * 1024);
    }

    public double toGigabytes() {
        return this.value / (1024.0 * 1024 * 1024);
    }

    public double toTerabytes() {
        return this.value / (1024.0 * 1024 * 1024 * 1024);
    }

    public Storage add(Storage other) {
        return new Storage(this.value + other.value);
    }

    public Storage subtract(Storage other) {
        return new Storage(this.value - other.value);
    }

    public Storage multiply(double factor) {
        return new Storage((long) (this.value * factor));
    }

    public Storage divide(double divisor) {
        if (divisor == 0) throw new ArithmeticException("Cannot divide by zero");
        return new Storage((long) (this.value / divisor));
    }

    @Override
    public String toString() {
        return String.format("%,d bytes", value);
    }
}
