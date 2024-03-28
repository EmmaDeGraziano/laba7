package edu.sdccd.cisc191.template;

import java.util.HashMap;

public class HashMapConsumer {
    private HashMap list;

    public HashMapConsumer(HashMap enlist)
    {
        list = new HashMap<Object, Integer>();
        list = enlist;
    }


    public String consume()
    {
        String str = (String)list.get(0);
        list.remove(0);
        return str;
    }

}
