package com.decorate;

import com.sun.jndi.ldap.Ber;

/**
 * Created by xiaobyc on 2018/3/5.
 */
public class StarbuzzCoffee {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDeacription()+"$"+beverage.cost());
        Beverage beverage2  = new HouseBlend();
        beverage2 = new Mocha(beverage2);
        System.out.println(beverage2.getDeacription()+"$ "+beverage2.cost());
    }

}
