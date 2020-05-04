package com.thinksee.sd.strategypattern;

/**
 * Created by thinksee on 2020/5/4 0004.
 *
 * @author 1563896950@qq.com
 * @github https://www.github.com/thinksee
 **/
public class OperationSubtract implements Strategy{

    public int doOperation(int num1, int num2) {
        return num1 - num2;
    }
}
