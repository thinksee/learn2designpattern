package com.thinksee.bd.singletonpattern;

/**
 * Created by thinksee on 2020/5/3 0003.
 *
 * @author 1563896950@qq.com
 * @github https://www.github.com/thinksee
 **/
public class StaticInnerSingleton {
    private static class StaticInnerSingletonHolder {
        private static final StaticInnerSingleton INSTANCE = new StaticInnerSingleton();
    }
    private StaticInnerSingleton(){}
    public static final StaticInnerSingleton getInstance(){
        return StaticInnerSingletonHolder.INSTANCE;
    }
}
