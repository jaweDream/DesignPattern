package exercise2.test1.impl;

import exercise2.test1.DisplayElement;
import exercise2.test1.Observer;
import exercise2.test1.Subject;

public class CurrentConditionsDisplay implements Observer, DisplayElement {

    private float temp;
    private float humidity;
    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current conditions:" + temp +
                "F degrees and " + humidity +"% humidity");
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        display();
    }


}
