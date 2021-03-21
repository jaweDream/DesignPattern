package exercise2.test2.impl;

import exercise2.test2.DisplayElement;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionsDisplay implements Observer, DisplayElement {

    private float temp;
    private float humidity;
    private WeatherData2 weatherData;

    public CurrentConditionsDisplay(WeatherData2 weatherData) {
        this.weatherData = weatherData;
        weatherData.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current conditions:" + temp +
                "F degrees and " + humidity +"% humidity");
    }

    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof WeatherData2){
            WeatherData2 weatherData2 = (WeatherData2) o;
            this.temp = weatherData2.getTemperature();
            this.humidity = weatherData2.getHumidity();
            display();
        }
    }
}
