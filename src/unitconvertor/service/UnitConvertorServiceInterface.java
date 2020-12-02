package unitconvertor.service;

// TODO: Auto-generated Javadoc
/**
 * The Interface UnitConvertorServiceInterface.
 */
public interface UnitConvertorServiceInterface {
	
	/**
	 * Gets the celsius from kelvin.
	 *
	 * @param kelvin the kelvin
	 * @return the celsius from kelvin
	 */
	public double getCelsiusFromKelvin(double kelvin);
	
	/**
	 * Gets the kelvin from celsius.
	 *
	 * @param celsius the celsius
	 * @return the kelvin from celsius
	 */
	public double getKelvinFromCelsius(double celsius);
	
	/**
	 * Gets the kilometers from miles.
	 *
	 * @param miles the miles
	 * @return the kilometers from miles
	 */
	public double getKilometersFromMiles(double miles);
	
	/**
	 * Gets the miles from kilometers.
	 *
	 * @param kilometers the kilometers
	 * @return the miles from kilometers
	 */
	public double getMilesFromKilometers(double kilometers);

}
