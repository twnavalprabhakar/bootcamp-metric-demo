package com.twnp.bootcamp.metric;

import java.math.BigDecimal;

public enum UnitWeight implements Convertible {
    MILLIGRAM("0.001"),
    CENTIGRAM("0.01"),
    DECIGRAM("0.1"),
    GRAM("1"),
    DECAGRAM("10"),
    HECTOGRAM("100"),
    KILOGRAM("1000");

    private final BigDecimal conversionFactor;

    UnitWeight(String conversionFactor) {
        this.conversionFactor = new BigDecimal(conversionFactor);
    }

    @Override
    public BigDecimal conversionFactor() {
        return conversionFactor;
    }
}
