package com.twnp.bootcamp.metric;

import java.math.BigDecimal;

public interface Convertible {
    BigDecimal conversionFactor();

    default BigDecimal toBase(BigDecimal valueFrom) {
        return valueFrom.multiply(conversionFactor());
    }
}
