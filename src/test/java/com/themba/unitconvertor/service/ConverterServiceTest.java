package com.themba.unitconvertor.service;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

import static org.junit.jupiter.api.Assertions.*;

class ConverterServiceTest {

	private ConverterService converterService;

	private DecimalFormat df;

	public ConverterServiceTest() {
		converterService = new ConverterService();
	}

	/**
	 * Round results to 4 decimal places
	 * @param value
	 * @return
	 */
	private double roundUp(double value){
		df = new DecimalFormat("#.####");
		df.setRoundingMode(RoundingMode.CEILING);

		return Double.parseDouble(df.format(value));
	}

    @Test
    void convertKelvinToCelsius() {
    	double result = converterService.ConvertKelvinToCelsius(3);
    	assertEquals(-270.15, result);
    }

    @Test
    void convertCelsiusToKelvin() {
		double result = converterService.ConvertCelsiusToKelvin(1);
		assertEquals(274.15, result);
    }

    @Test
    void convertMilesToKilometers() {
		double result = converterService.ConvertMilesToKilometers(25);
		assertEquals(40.2335, roundUp(result));
    }

    @Test
    void convertKilometersToMiles() {
		double result = converterService.ConvertKilometersToMiles(50);
		assertEquals(31.0687,roundUp(result));
    }
}
