package com.strategy;

/**
 * Created by xiaobyc on 2017/6/4.
 */
public class Duck {
    private QuackBehavior quackBehavior;
public void performQuack(){
    quackBehavior.quack();
}
}
