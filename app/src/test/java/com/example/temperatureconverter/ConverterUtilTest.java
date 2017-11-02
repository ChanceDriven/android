package com.example.temperatureconverter;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by robert.rodriguez on 11/2/2017.
 */

public class ConverterUtilTest {
    @Test
    public void testConvertFahrenheitToCelsius() throws Exception {
        float celsiusBoiling = ConverterUtil.convertFahrenheitToCelsius(212);
        assertEquals("Conversion from fahrenheit to celsius failed",
                100, celsiusBoiling, 0.001);
    }

    @Test
    public void testConvertCelsiusToFahrenheit() throws Exception {
        float fahrenheitBoiling = ConverterUtil.convertCelsiusToFahrenheit(100);
        assertEquals("Conversion from celsius to fahrenheit failed",
                212, fahrenheitBoiling, 0.001);
    }
}
