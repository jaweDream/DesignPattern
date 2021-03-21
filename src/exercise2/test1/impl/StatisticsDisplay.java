package exercise2.test1.impl;

import exercise2.test1.DisplayElement;
import exercise2.test1.Observer;
import exercise2.test1.Subject;

public class StatisticsDisplay implements Observer, DisplayElement {

    private float pressure;
    private Subject weatherData;

    public StatisticsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.pressure = pressure;
        display();
    }

    @Override
    public void display() {
        System.out.println("Statistics display："+pressure);
    }
}
