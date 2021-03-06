package com.thinksee.sd.observerpattern;

/**
 * Created by thinksee on 2020/5/4 0004.
 *
 * @author 1563896950@qq.com
 * @github https://www.github.com/thinksee
 **/
public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}
