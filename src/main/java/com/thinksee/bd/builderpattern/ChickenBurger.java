package com.thinksee.bd.builderpattern;

import com.thinksee.bd.builderpattern.rawmaterial.impl.item.Burger;

/**
 * Created by thinksee on 2020/5/3 0003.
 *
 * @author 1563896950@qq.com
 * @github https://www.github.com/thinksee
 **/
public class ChickenBurger extends Burger {
    public float price() {
        return 50.5f;
    }
    public String name() {
        return "Chicken Burger";
    }
}
