package com.twnp.bootcamp.metric;

import java.math.BigDecimal;

public class Weight extends Metric {
    public Weight(BigDecimal value, UnitWeight unit) {
        super(value, unit);
    }

    public Weight plus(Weight other) {
        return new Weight(value.add(toUnit(other)), (UnitWeight) unit);
    }
}
