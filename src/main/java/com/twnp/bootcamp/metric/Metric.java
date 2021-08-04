package com.twnp.bootcamp.metric;

import java.math.BigDecimal;
import java.util.Objects;

public abstract class Metric {
    protected BigDecimal value;
    protected Convertible unit;

    protected Metric(BigDecimal value, Convertible unit) {
        this.value = value;
        this.unit = unit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        return equivalent((Metric) o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, unit);
    }

    protected boolean exactInstanceOf(String otherClassName) {
        return !(getClass().getName().equals(otherClassName));
    }

    private boolean equivalent(Metric other) {
        boolean equivalent;
        if (exactInstanceOf(other.getClass().getName())) {
            equivalent = false;
        } else if (unit.equals(other.unit)) {
            equivalent = value.compareTo(other.value) == 0;
        } else {
            equivalent = toBase(this).compareTo(toBase(other)) == 0;
        }
        return equivalent;
    }

    protected BigDecimal toUnit(Metric from) {
        return from.unit.toUnit(from.value, unit);
    }

    private BigDecimal toBase(Metric from) {
        return from.unit.toBase(from.value);
    }

}
