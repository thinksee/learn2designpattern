package com.thinksee.bd.singletonpattern;

/**
 * Created by thinksee on 2020/5/3 0003.
 *
 * @author 1563896950@qq.com
 * @github https://www.github.com/thinksee
 **/
public class HungerSingleton {
    private static HungerSingleton instance = new HungerSingleton();
    private HungerSingleton (){}
    public static HungerSingleton getInstance() {
        return instance;
    }
}
