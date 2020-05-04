package com.thinksee.cd.filterpattern;

import java.util.List;

/**
 * Created by thinksee on 2020/5/4 0004.
 *
 * @author 1563896950@qq.com
 * @github https://www.github.com/thinksee
 **/
public interface Criteria {
    public List<Person> meetCriteria(List<Person> persons);
}
