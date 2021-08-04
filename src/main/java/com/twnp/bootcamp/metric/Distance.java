package com.twnp.bootcamp.metric;

import java.math.BigDecimal;

public class Distance extends Metric {
    public Distance(BigDecimal value, UnitDistance unit) {
        super(value, unit);
    }

    public Distance plus(Distance other) {
        return new Distance(value.add(toUnit(other)), (UnitDistance) unit);
    }
}
