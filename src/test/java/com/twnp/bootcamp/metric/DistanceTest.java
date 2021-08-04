package com.twnp.bootcamp.metric;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DistanceTest {

    @Test
    void shouldBeSameGivenOneMeterAndOneMeter() {
        Distance oneMeter = new Distance(BigDecimal.ONE, UnitDistance.METER);
        Distance anotherMeter = new Distance(BigDecimal.ONE, UnitDistance.METER);
        assertEquals(oneMeter, anotherMeter);
    }

    @Test
    void shouldBeSameGivenOneKiloMeterAndOneThousandMeters() {
        Distance oneKiloMeter = new Distance(BigDecimal.ONE, UnitDistance.KILOMETER);
        Distance thousandMeters = new Distance(new BigDecimal("1000"), UnitDistance.METER);
        assertEquals(oneKiloMeter, thousandMeters);
    }

    @Test
    void shouldBeSameGivenFiveHundredCentimetersAndDecimalFiveDecameter() {
        Distance fiveHundredCentimeters = new Distance(new BigDecimal("500"), UnitDistance.CENTIMETER);
        Distance decimalFiveDecameter = new Distance(new BigDecimal("0.5"), UnitDistance.DECAMETER);
        assertEquals(fiveHundredCentimeters, decimalFiveDecameter);
    }

    @Test
    void shouldBeOnePointFiveKiloMeterWhenOneKiloMeterAddedToFiveHundredMeters() {
        Distance oneKiloMeter = new Distance(BigDecimal.ONE, UnitDistance.KILOMETER);
        Distance fiveHundredMeters = new Distance(new BigDecimal("500"), UnitDistance.METER);
        assertEquals(0, new BigDecimal(1.5).compareTo(oneKiloMeter.plus(fiveHundredMeters).value));
    }
}
