package com.twnp.bootcamp.metric;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DistanceTest {

    @Test
    void shouldBeSameGivenOneMeterAndOneMeter() {
        Distance oneMeter = new Distance(BigDecimal.ONE, Unit.METER);
        Distance anotherMeter = new Distance(BigDecimal.ONE, Unit.METER);
        assertEquals(oneMeter, anotherMeter);
    }
}
