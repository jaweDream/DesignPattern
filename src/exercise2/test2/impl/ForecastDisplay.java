package exercise2.test2.impl;

import exercise2.test2.DisplayElement;

import java.util.Observable;
import java.util.Observer;

public class ForecastDisplay implements Observer, DisplayElement {

    private float currentPressure = 29.92f;
    private float lastPressure;

    public ForecastDisplay(Observable observable) {
        observable.addObserver(this);

    }

    @Override
    public void display() {
        System.out.println("lastPressure："+lastPressure);
    }

    @Override
    public void update(Observable observable, Object arg) {
        WeatherData2 weatherData2 = (WeatherData2)observable;
        if (observable instanceof WeatherData2){
            lastPressure = currentPressure;
            currentPressure = weatherData2.getPressure();
            display();
        }

    }
}
