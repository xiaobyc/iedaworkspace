package com.decorate;

/**
 * Created by xiaobyc on 2018/3/5.
 */
public class Mocha extends CondimentDecorator {
    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDeacription()+" ,Mocha";
    }
    public double cost(){
        return 0.20+beverage.cost();
    }
}
