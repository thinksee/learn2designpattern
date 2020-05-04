package com.thinksee.cd.flyweightpattern;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by thinksee on 2020/5/4 0004.
 *
 * @author 1563896950@qq.com
 * @github https://www.github.com/thinksee
 **/
public class ShapeFactory {
    private static final Map<String, Shape> circleMap = new HashMap<String, Shape>();
    public static Shape getCircle(String color) {
        Circle circle = (Circle) circleMap.get(color);
        if(null == circle) {
            circle = new Circle(color);
            circleMap.put(color, circle);
            System.out.println("Creating circle of color : " + color);
        }
        return circle;
    }
}
