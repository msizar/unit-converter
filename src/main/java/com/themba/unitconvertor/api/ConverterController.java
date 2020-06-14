package com.themba.unitconvertor.api;

import com.themba.unitconvertor.service.ConverterService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("conversions")
public class ConverterController {

	private  final ConverterService converterService;

	public ConverterController(ConverterService converterService) {
		this.converterService = converterService;
	}

	@RequestMapping("ktoc")
	public double ConvertKelvinToCelsius(@RequestBody double value){
		return converterService.ConvertKelvinToCelsius(value);
	}

	@RequestMapping("ctok")
	public double ConvertCelsiusKelvin(@RequestBody double value){
		return converterService.ConvertCelsiusToKelvin(value);
	}

	@RequestMapping("mtok")
	public double ConvertMilesToKilometers(@RequestBody double value){
		return converterService.ConvertMilesToKilometers(value);
	}

	@RequestMapping("ktom")
	public double ConvertKilometersToMiles(@RequestBody double value) {
		return converterService.ConvertKilometersToMiles(value);
	}
}
