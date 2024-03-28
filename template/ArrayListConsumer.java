package edu.sdccd.cisc191.template;

import java.util.ArrayList;

public class ArrayListConsumer
{
    private ArrayList list;

    public ArrayListConsumer(ArrayList enlist)
    {
       list = new ArrayList<Object>();
       list = enlist;
    }


    public String consume()
    {
        String str = (String)list.get(0);
        list.remove(0);
        return str;
    }

}