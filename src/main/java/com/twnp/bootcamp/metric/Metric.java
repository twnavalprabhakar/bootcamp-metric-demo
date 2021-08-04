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
        if (!(o instanceof Metric)) return false;
        Metric metric = (Metric) o;
        return equivalent(metric);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, unit);
    }

    private boolean equivalent(Metric other) {
        if (unit.equals(other.unit)) {
            return value.compareTo(other.value) == 0;
        } else {
            return toBase(this).compareTo(toBase(other)) == 0;
        }
    }

    private BigDecimal toBase(Metric source) {
        return source.unit.toBase(source.value);
    }
}
