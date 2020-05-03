package com.thinksee.bd.prototypepattern;

/**
 * Created by thinksee on 2020/5/4 0004.
 *
 * @author 1563896950@qq.com
 * @github https://www.github.com/thinksee
 **/
public class Circle extends Shape{
    public Circle(){
        type = "Circle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
