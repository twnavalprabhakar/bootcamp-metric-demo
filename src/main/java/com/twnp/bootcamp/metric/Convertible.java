package com.twnp.bootcamp.metric;

import java.math.BigDecimal;
import java.math.RoundingMode;

public interface Convertible {
    BigDecimal conversionFactor();

    default BigDecimal toBase(BigDecimal valueFrom) {
        return valueFrom.multiply(conversionFactor());
    }

    default BigDecimal toUnit(BigDecimal value, Convertible unit) {
        return toBase(value).divide(unit.conversionFactor(), 3, RoundingMode.CEILING);
    }
}
