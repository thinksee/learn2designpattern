package com.thinksee.bd.singletonpattern;

/**
 * Created by thinksee on 2020/5/3 0003.
 *
 * @author 1563896950@qq.com
 * @github https://www.github.com/thinksee
 **/
public class DCLSingleton {
    private volatile static DCLSingleton dclSingleton;
    private DCLSingleton(){}
    public static DCLSingleton getDclSingleton(){
        if(dclSingleton == null) {
            synchronized (DCLSingleton.class) {
                if(dclSingleton == null) {
                    dclSingleton = new DCLSingleton();
                }
            }
        }
        return dclSingleton;
    }
}
