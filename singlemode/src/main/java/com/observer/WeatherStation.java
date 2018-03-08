package com.observer;

/**
 * Created by xiaobyc on 2017/7/13.
 */
public class WeatherStation {
    public static void main(String[] args) {
        WeatherData  weatherData = new WeatherData();
        CurrentConditionsDisplay  currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        weatherData.setMeasurements(80,65,30.4f);
        weatherData.setMeasurements(82,70,29.4f);
        weatherData.setMeasurements(78,90,35.4f);
    }
}
