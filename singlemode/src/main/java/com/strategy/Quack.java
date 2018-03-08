package com.strategy;

/**
 * Created by xiaobyc on 2017/6/4.
 */
public class Quack implements QuackBehavior {
    public void quack() {
        System.out.println("鸭子呱呱叫");
    }
}
