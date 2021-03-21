package exercise2.test2.impl;


public class WeatherStation2 {
    public static void main(String[] args) {
        WeatherData2 weatherData2 = new WeatherData2();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData2);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData2);
        weatherData2.setMeasurements(12, 22, 13);
        weatherData2.setMeasurements(342, 32, 23);
    }
}
