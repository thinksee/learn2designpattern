package com.thinksee.sd.iteratorpattern;

/**
 * Created by thinksee on 2020/5/4 0004.
 *
 * @author 1563896950@qq.com
 * @github https://www.github.com/thinksee
 **/
public class NameRepository implements Container {
    public String names[] = {"Robert" , "John" ,"Julie" , "Lora"};

    public Iterator getIterator() {
        return new NameIterator();
    }

    private class NameIterator implements Iterator {

        int index;

        public boolean hasNext() {
            if(index < names.length){
                return true;
            }
            return false;
        }

        public Object next() {
            if(this.hasNext()){
                return names[index++];
            }
            return null;
        }
    }
}
