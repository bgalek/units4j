package com.github.bgalek.units4j;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StorageTest {

    @Test
    public void testOfBytes() {
        Storage storage = Storage.ofBytes(1024);
        assertEquals(1024, storage.toBytes());
    }

    @Test
    public void testOfKilobytes() {
        Storage storage = Storage.ofKilobytes(1);
        assertEquals(1024, storage.toBytes());
    }

    @Test
    public void testOfMegabytes() {
        Storage storage = Storage.ofMegabytes(1);
        assertEquals(1024 * 1024, storage.toBytes());
    }

    @Test
    public void testOfGigabytes() {
        Storage storage = Storage.ofGigabytes(1);
        assertEquals(1024 * 1024 * 1024, storage.toBytes());
    }

    @Test
    public void testOfTerabytes() {
        Storage storage = Storage.ofTerabytes(1);
        assertEquals(1024L * 1024 * 1024 * 1024, storage.toBytes());
    }

    @Test
    public void testToKilobytes() {
        Storage storage = Storage.ofBytes(1024);
        assertEquals(1, storage.toKilobytes());
    }

    @Test
    public void testToMegabytes() {
        Storage storage = Storage.ofBytes(1024 * 1024);
        assertEquals(1, storage.toMegabytes());
    }

    @Test
    public void testToGigabytes() {
        Storage storage = Storage.ofBytes(1024 * 1024 * 1024);
        assertEquals(1, storage.toGigabytes());
    }

    @Test
    public void testToTerabytes() {
        Storage storage = Storage.ofBytes(1024L * 1024 * 1024 * 1024);
        assertEquals(1, storage.toTerabytes());
    }

    @Test
    public void testAdd() {
        Storage storage1 = Storage.ofBytes(1024);
        Storage storage2 = Storage.ofBytes(1024);
        Storage result = storage1.add(storage2);
        assertEquals(2048, result.toBytes());
    }

    @Test
    public void testSubtract() {
        Storage storage1 = Storage.ofBytes(2048);
        Storage storage2 = Storage.ofBytes(1024);
        Storage result = storage1.subtract(storage2);
        assertEquals(1024, result.toBytes());
    }

    @Test
    public void testMultiply() {
        Storage storage = Storage.ofBytes(1024);
        Storage result = storage.multiply(2);
        assertEquals(2048, result.toBytes());
    }

    @Test
    public void testDivide() {
        Storage storage = Storage.ofBytes(2048);
        Storage result = storage.divide(2);
        assertEquals(1024, result.toBytes());
    }

    @Test
    public void testDivideByZero() {
        Storage storage = Storage.ofBytes(1024);
        assertThrows(ArithmeticException.class, () -> storage.divide(0));
    }

    @Test
    public void testToString() {
        Storage storage = Storage.ofBytes(1024);
        assertEquals("1,024 bytes", storage.toString());
    }
}
