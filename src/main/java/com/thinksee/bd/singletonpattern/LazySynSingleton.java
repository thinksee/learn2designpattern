package com.thinksee.bd.singletonpattern;

/**
 * Created by thinksee on 2020/5/3 0003.
 *
 * @author 1563896950@qq.com
 * @github https://www.github.com/thinksee
 **/
public class LazySynSingleton {
    private static LazySynSingleton instance;
    private LazySynSingleton (){}
    public static synchronized LazySynSingleton getInstance() {
        if (instance == null) {
            instance = new LazySynSingleton();
        }
        return instance;
    }
}
