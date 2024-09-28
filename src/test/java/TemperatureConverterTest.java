import org.example.TemperatureConverter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TemperatureConverterTest {

    private final TemperatureConverter converter = new TemperatureConverter();

    @Test
    public void testKelvinToFahrenheit() {
        assertEquals(80.51000000000008, TemperatureConverter.kelvinToFah(300.1), 0.1, "300.1 Kelvin should be 59.0 Fahrenheit");
    }

    @Test
    public void testFahrenheitToCelsius() {
        assertEquals(0.0, converter.fahrenheitToCelsius(32), 0.1, "32 Fahrenheit should be 0 Celsius");
    }

    @Test
    public void testCelsiusToFahrenheit() {
        assertEquals(32.0, converter.celsiusToFahrenheit(0), 0.1, "0 Celsius should be 32 Fahrenheit");
    }

    @Test
    public void testIsExtremeTemperature() {
        assertTrue(converter.isExtremeTemperature(-50), "Temperature -50 Celsius should be extreme");
        assertTrue(converter.isExtremeTemperature(51), "Temperature 51 Celsius should be extreme");
        assertFalse(converter.isExtremeTemperature(25), "Temperature 25 Celsius should not be extreme");
    }
}
