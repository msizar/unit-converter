package com.themba.unitconvertor.service;

import org.springframework.stereotype.Service;

@Service
public class ConverterService {

	private final double KELVIN = 273.15;
	private final double KILOMETER = 1.60934;

	public double ConvertKelvinToCelsius(double value) {
		return  value - KELVIN;
	}

	public double ConvertCelsiusToKelvin(double value) {
		return value + KELVIN;
	}

	public double ConvertMilesToKilometers(double value) {
		return value * KILOMETER;
	}


	public double ConvertKilometersToMiles(double value) {
		return value/KILOMETER;
	}


}
