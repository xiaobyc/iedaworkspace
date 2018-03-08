package com.observer;

/**
 * Created by xiaobyc on 2017/7/13.
 */
public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers();
}
