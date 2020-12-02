package unitconvertor.service.impl;

import unitconvertor.service.UnitConvertorServiceInterface;

public class UnitConvertorServiceInterfaceImpl implements UnitConvertorServiceInterface {
	
	@Override
	public double getCelsiusFromKelvin(double kelvin) {
		//0 kelvin is equivalent to -273.15 celsius
		return kelvin - 273.15 ;
	}

	@Override
	public double getKelvinFromCelsius(double celsius) {
		return celsius + 273.15;
	}

	@Override
	public double getKilometersFromMiles(double miles) {
		// 1km is equivalent to 0.6214 miles
		return miles / 0.6214;
	}

	@Override
	public double getMilesFromKilometers(double kilometers) {
		return kilometers * 0.6214;
	}
}
