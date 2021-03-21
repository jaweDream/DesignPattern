package exercise2.test1.impl;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        weatherData.setMeasurements(12,22,13);
        weatherData.setMeasurements(342,32,23);
    }
}
