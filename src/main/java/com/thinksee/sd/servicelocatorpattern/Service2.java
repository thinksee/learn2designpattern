package com.thinksee.sd.servicelocatorpattern;

/**
 * Created by thinksee on 2020/5/4 0004.
 *
 * @author 1563896950@qq.com
 * @github https://www.github.com/thinksee
 **/
public class Service2 implements Service {
    public void execute(){
        System.out.println("Executing Service2");
    }

    public String getName() {
        return "Service2";
    }
}