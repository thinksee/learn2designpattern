package com.thinksee.sd.visitorpattern;

/**
 * Created by thinksee on 2020/5/4 0004.
 *
 * @author 1563896950@qq.com
 * @github https://www.github.com/thinksee
 **/
public class ComputerPartDisplayVisitor implements ComputerPartVisitor {

    public void visit(Computer computer) {
        System.out.println("Displaying Computer.");
    }

    public void visit(Mouse mouse) {
        System.out.println("Displaying Mouse.");
    }

    public void visit(Keyboard keyboard) {
        System.out.println("Displaying Keyboard.");
    }

    public void visit(Monitor monitor) {
        System.out.println("Displaying Monitor.");
    }
}
