package observermode;

import java.util.ArrayList;

/**
 * Created by xiaobyc on 2018/3/1.
 */
public class WeatherData implements Subject {
     private ArrayList observers;
     private float temperature;
     private float humidity;
     private float pressure;

    public WeatherData() {
        this.observers = new ArrayList();
    }

    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
                int i =observers.indexOf(observer);
                if(i>=0){
                    observers.remove(observer);
                }
    }

    public void notifyObserver() {
        for(int i=0;i<observers.size();i++){
            Observer observer =(Observer) observers.get(i);
            observer.update(temperature,humidity,pressure);
        }
    }
    public void measurementsChanged(){
        notifyObserver();
    }
    public void setMeasurements(float temperature,float humidity,float pressure){
        this.temperature =temperature;
        this.humidity =humidity;
        this.pressure =pressure;
        measurementsChanged();
    }
}
