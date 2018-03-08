package com.observer.jdkobserver;

import com.observer.Observer;

/**
 * Created by xiaobyc on 2017/9/11.
 */
public class WeatherData extends java.util.Observable {
    private float temperature;
    private float humidity;
    private float pressure;

    public void setMeasurements(float temperature,float humidity,float pressure){
        this.temperature =temperature;
        this.humidity =humidity;
        this.pressure =pressure;
        measurementsChanged();
    }

    public void measurementsChanged(){
        setChanged();
        notifyObservers();
    }

    public WeatherData() {
    }

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }

    public float getPressure() {
        return pressure;
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
    }
}
