package com.strategy;

/**
 * Created by xiaobyc on 2017/6/4.
 */
public class MuteQuack implements QuackBehavior {
    public void quack() {
        System.out.println(" nothing...");
    }
}
