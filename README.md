[![Build](https://github.com/bgalek/units4j/actions/workflows/build.yaml/badge.svg)](https://github.com/bgalek/units4j/actions/workflows/build.yaml)
![Maven Central Version](https://img.shields.io/maven-central/v/com.github.bgalek/units4j)

# Units4J

Units4J is a Java library for handling physical quantities and units of measure.
It is designed to be simple to use, and to be able to handle any unit of measure,
including those that are not part of the International System of Units (SI).

## Installation

To include Units4J in your project, add the following dependency to your `build.gradle.kts` file:

```kotlin
dependencies {
    implementation("com.github.bgalek:units4j:1.0.0")
}
```

## Why

I often found myself creating the same simple unit conversions in multiple projects, over and over again.
Sadly, Java does not support standard units out of the box, unlike i.e. F#.

## Features

- **Comprehensive Unit Support**: Supports a wide range of units, including non-SI units.
- **Unit Conversion**: Easily convert between different units of measure.
- **Type Safety**: Ensures type safety for physical quantities.
- **Extensible**: Easily add custom units and quantities.

> [!NOTE]  
> Curretnly this library uses doubles to store values.
> This may lead to precision loss in some cases.
> If this library turns out to be useful I'll be happy
> to add support for arbitrary precision numbers.

## Usage

### Example

```java
import com.github.bgalek.units4j.Storage;

public class Example {
    public static void main(String[] args) {
        Storage storage = Storage.ofGigabytes(1);
        System.out.println("File size in MB: " + storage.toMegabytes());
    }
}
```

### Calculating Units

```java
import com.github.bgalek.units4j.Length;

public class Example {
    public static void main(String[] args) {
        Length length = Length.ofMeters(10);
        length.add(Length.ofCentimeters(50));
        System.out.println("Length in centimeters " + lengthInMeters.toCentimeters());
    }
}
```

## Contribution

- Add more units to the library.
- Suggest new features or improvements.
