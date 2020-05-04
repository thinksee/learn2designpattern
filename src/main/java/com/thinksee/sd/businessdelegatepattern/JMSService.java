package com.thinksee.sd.businessdelegatepattern;

/**
 * Created by thinksee on 2020/5/4 0004.
 *
 * @author 1563896950@qq.com
 * @github https://www.github.com/thinksee
 **/
public class JMSService implements BusinessService {
    public void doProcessing() {
        System.out.println("Processing task by invoking JMS Service");
    }}
