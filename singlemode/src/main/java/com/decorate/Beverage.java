package com.decorate;

/**
 * Created by xiaobyc on 2018/3/5.
 */
public abstract class Beverage {
    String deacription="unkown Beverage";
    public String getDeacription(){
        return deacription;

    }
    public abstract  double cost();
}
