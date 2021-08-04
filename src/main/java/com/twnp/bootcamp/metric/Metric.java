package com.twnp.bootcamp.metric;

import java.math.BigDecimal;
import java.util.Objects;

public abstract class Metric {
    protected BigDecimal value;
    protected Unit unit;

    public Metric(BigDecimal value, Unit unit) {
        this.value = value;
        this.unit = unit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Metric)) return false;
        Metric metric = (Metric) o;
        return value.equals(metric.value) && unit == metric.unit;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, unit);
    }
}
