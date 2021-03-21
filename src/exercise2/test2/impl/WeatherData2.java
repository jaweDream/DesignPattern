package exercise2.test2.impl;

import java.util.Observable;

public class WeatherData2 extends Observable {
    private float temperature;
    private float humidity;
    private float pressure;

    //不再需要为记住观察者而建立数据结构
    public WeatherData2() {
    }

    public void measurementsChanged(){
        setChanged();
        notifyObservers();
    }

    public void setMeasurements(float temperature,float humidity,float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
