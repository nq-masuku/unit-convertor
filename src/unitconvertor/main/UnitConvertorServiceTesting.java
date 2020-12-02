package unitconvertor.main;


import java.util.logging.Logger;

import unitconvertor.service.UnitConvertorServiceInterface;
import unitconvertor.service.impl.UnitConvertorServiceInterfaceImpl;


public class UnitConvertorServiceTesting {
	
	private static final Logger LOGGER = Logger.getLogger(UnitConvertorServiceTesting.class.getName());

	public static void main(String[] args) throws InterruptedException {
		//Below we test the service methods and log their execution time.
		
		UnitConvertorServiceInterface kcService=new UnitConvertorServiceInterfaceImpl();
		long startTime;
		long endTime;
		
		
		startTime = System.currentTimeMillis();
		System.out.println(kcService.getCelsiusFromKelvin(260.0));
		endTime = System.currentTimeMillis();
		executionDuration("getCelsiusFromKelvin",startTime, endTime);
		
		
		startTime = System.currentTimeMillis();
		System.out.println(kcService.getKelvinFromCelsius(-33.15));
		endTime = System.currentTimeMillis();
		executionDuration("getKelvinFromCelsius",startTime, endTime);

		
		startTime = System.currentTimeMillis();
		System.out.println(kcService.getKilometersFromMiles(14.0));
		endTime = System.currentTimeMillis();
		executionDuration("getKilometersFromMiles",startTime, endTime);
	
		startTime = System.currentTimeMillis();
		System.out.println(kcService.getMilesFromKilometers(14.08));
		endTime = System.currentTimeMillis();
		executionDuration("getMilesFromKilometers",startTime, endTime);

	}
	
	public static void executionDuration(String methodName, long startTime, long endTime) {
		LOGGER.info(methodName + " took " + (endTime - startTime) + " milliseconds");
	}

}