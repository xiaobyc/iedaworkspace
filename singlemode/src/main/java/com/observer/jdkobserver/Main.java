package com.observer.jdkobserver;

/**
 * Created by xiaobyc on 2017/9/11.
 */
public class Main {
    public static void main(String[] args) {
        WeatherData  weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        weatherData.setMeasurements(20,20,20);
    }
}
