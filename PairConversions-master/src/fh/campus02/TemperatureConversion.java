package fh.campus02;


public class TemperatureConversion {

    public static void main(String[] args) {
        double temperatureInCelsius = 5;
        double temperatureInFahrenheit;


        temperatureInFahrenheit = celsiusToFahrenheit (temperatureInCelsius);

        System.out.println(temperatureInCelsius + " degrees Celsius are " + temperatureInFahrenheit + " degrees Fahrenheit");
    }


    public static double celsiusToFahrenheit(double temperatureInCelsius) {

        return (temperatureInCelsius * 9/5) + 32;


        //(0 °C × 9/5) + 32 = 32 °F
    }
}
