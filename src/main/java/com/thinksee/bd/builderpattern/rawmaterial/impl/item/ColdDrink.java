package com.thinksee.bd.builderpattern.rawmaterial.impl.item;

import com.thinksee.bd.builderpattern.rawmaterial.Item;
import com.thinksee.bd.builderpattern.rawmaterial.Packing;
import com.thinksee.bd.builderpattern.rawmaterial.impl.packing.Bottle;

/**
 * Created by thinksee on 2020/5/3 0003.
 *
 * @author 1563896950@qq.com
 * @github https://www.github.com/thinksee
 **/
public class ColdDrink implements Item {
    public String name() {
        return null;
    }

    public Packing packing() {
        return new Bottle();
    }

    public float price() {
        return 0;
    }
}
