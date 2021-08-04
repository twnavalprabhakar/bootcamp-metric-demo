package com.twnp.bootcamp.metric;

import com.twnp.bootcamp.metric.Convertible;

import java.math.BigDecimal;

public enum UnitDistance implements Convertible {
    MILLIMETER("0.001"),
    CENTIMETER("0.01"),
    DECIMETER("0.1"),
    METER("1"),
    DECAMETER("10"),
    HECTOMETER("100"),
    KILOMETER("1000");

    private final BigDecimal conversionFactor;

    UnitDistance(String conversionFactor) {
        this.conversionFactor = new BigDecimal(conversionFactor);
    }

    @Override
    public BigDecimal conversionFactor() {
        return conversionFactor;
    }
}
