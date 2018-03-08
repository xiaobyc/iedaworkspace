package com.observer.jdkobserver;

import com.observer.DisplayElement;
import java.util.Observer;
import java.util.Observable;

/**
 * Created by xiaobyc on 2017/9/11.
 */
public class CurrentConditionsDisplay implements Observer,DisplayElement {
    Observable observable;
    private float temperature;
    private float humidity;
    public CurrentConditionsDisplay(Observable observable) {
        super();
        this.observable =observable;
        observable.addObserver((java.util.Observer) this);
    }

    public void update(Observable o, Object arg) {
        if(observable instanceof  WeatherData){
            WeatherData  weatherData = (WeatherData) o;
            this.temperature =weatherData.getTemperature();
            this.display();
        }
    }

    public void display() {
        System.out.println("temperature="+temperature);
    }
}
