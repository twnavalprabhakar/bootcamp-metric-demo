package com.twnp.bootcamp.metric;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class WeightTest {

    @Test
    void shouldBeSameGivenOneGramAndOneGram() {
        Weight oneGram = new Weight(BigDecimal.ONE, UnitWeight.GRAM);
        Weight anotherGram = new Weight(BigDecimal.ONE, UnitWeight.GRAM);
        assertEquals(oneGram, anotherGram);
    }

    @Test
    void shouldBeSameGivenOneKiloGramAndOneThousandGrams() {
        Weight oneKiloGram = new Weight(BigDecimal.ONE, UnitWeight.KILOGRAM);
        Weight thousandGrams = new Weight(new BigDecimal("1000"), UnitWeight.GRAM);
        assertEquals(oneKiloGram, thousandGrams);
    }

    @Test
    void shouldNotBeSameGivenOneKiloGramAndOneKiloMeter() {
        Weight oneKiloGram = new Weight(BigDecimal.ONE, UnitWeight.KILOGRAM);
        Distance oneKiloMeter = new Distance(BigDecimal.ONE, UnitDistance.KILOMETER);
        assertNotEquals(oneKiloGram, oneKiloMeter);
    }

    @Test
    void shouldBeSameGivenFiveHundredCentimetersAndDecimalFiveDecameter() {
        Distance fiveHundredCentimeters = new Distance(new BigDecimal("500"), UnitDistance.CENTIMETER);
        Distance decimalFiveDecameter = new Distance(new BigDecimal("0.5"), UnitDistance.DECAMETER);
        assertEquals(fiveHundredCentimeters, decimalFiveDecameter);
    }
}
