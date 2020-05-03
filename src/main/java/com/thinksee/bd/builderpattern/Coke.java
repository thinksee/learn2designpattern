package com.thinksee.bd.builderpattern;

import com.thinksee.bd.builderpattern.rawmaterial.impl.item.ColdDrink;

/**
 * Created by thinksee on 2020/5/3 0003.
 *
 * @author 1563896950@qq.com
 * @github https://www.github.com/thinksee
 **/
public class Coke extends ColdDrink {
    @Override
    public float price() {
        return 30.0f;
    }

    @Override
    public String name() {
        return "Coke";
    }
}
