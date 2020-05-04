package com.thinksee.cd.filterpattern;

import java.util.List;

/**
 * Created by thinksee on 2020/5/4 0004.
 *
 * @author 1563896950@qq.com
 * @github https://www.github.com/thinksee
 **/
public class AndCriteria implements Criteria{
    private Criteria criteria;
    private Criteria otherCriteria;

    public AndCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    public List<Person> meetCriteria(List<Person> persons) {
        // 第一次过滤
        List<Person> firstCriteriaPersons = criteria.meetCriteria(persons);
        // 第二次过滤 -> 返回
        return otherCriteria.meetCriteria(firstCriteriaPersons);
    }
}
