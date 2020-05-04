package com.thinksee.sd.interpreterpattern;

/**
 * Created by thinksee on 2020/5/4 0004.
 *
 * @author 1563896950@qq.com
 * @github https://www.github.com/thinksee
 **/
public class TerminalExpression implements Expression {

    private String data;

    public TerminalExpression(String data){
        this.data = data;
    }

    public boolean interpret(String context) {
        if(context.contains(data)){
            return true;
        }
        return false;
    }
}
