package com.thinksee.sd.commandpattern;

/**
 * Created by thinksee on 2020/5/4 0004.
 *
 * @author 1563896950@qq.com
 * @github https://www.github.com/thinksee
 **/
public class Stock {

    private String name = "ABC";
    private int quantity = 10;

    public void buy(){
        System.out.println("Stock [ Name: "+name+", Quantity: " + quantity +"] bought");
    }
    public void sell(){
        System.out.println("Stock [ Name: "+name+", Quantity: " + quantity +" ] sold");
    }
}
