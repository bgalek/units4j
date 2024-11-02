package com.github.bgalek.units4j;

import java.util.Objects;

public abstract class BaseUnit<UNIT, INTERNAL> implements Comparable<BaseUnit<UNIT, INTERNAL>> {
    protected final INTERNAL value;

    public BaseUnit(INTERNAL value) {
        this.value = value;
    }

    public abstract UNIT add(UNIT other);

    public abstract UNIT subtract(UNIT other);

    public abstract UNIT multiply(double factor);

    public abstract UNIT divide(double divisor);

    @Override
    public int compareTo(BaseUnit<UNIT, INTERNAL> value) {
        if (this.value instanceof Comparable) {
            return ((Comparable<INTERNAL>) this.value).compareTo(value.value);
        }
        return value.equals(this.value) ? 0 : -1;
    }

    @Override
    public abstract String toString();

    @Override
    public int hashCode() {
        return Objects.hashCode(value);
    }

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BaseUnit)) return false;

        BaseUnit<?, ?> baseUnit = (BaseUnit<?, ?>) o;
        return Objects.equals(value, baseUnit.value);
    }
}
