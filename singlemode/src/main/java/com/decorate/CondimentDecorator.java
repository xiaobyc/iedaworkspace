package com.decorate;

/**
 * Created by xiaobyc on 2018/3/5.
 */
public  abstract class CondimentDecorator extends Beverage {

    public abstract String getDescription();
    public double cost() {
        return 0;
    }
}
