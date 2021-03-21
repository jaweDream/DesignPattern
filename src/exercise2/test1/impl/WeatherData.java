package exercise2.test1.impl;

import exercise2.test1.Observer;
import exercise2.test1.Subject;

import java.util.ArrayList;

public class WeatherData implements Subject {

    private ArrayList<Observer> observers;
    private float temp;
    private float humidity;
    private float pressure;

    public WeatherData() {
        observers = new ArrayList();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for (Observer observer:observers
             ) {
            observer.update(temp,humidity,pressure);
        }
    }

    public void measurementsChanged(){
        notifyObserver();
    }

    public void setMeasurements(float temp,float humidity,float pressure){
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}
