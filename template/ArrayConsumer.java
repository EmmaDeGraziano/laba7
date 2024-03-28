package edu.sdccd.cisc191.template;

import java.util.Arrays;

    public class ArrayConsumer
    {
        private Object[] list;

        public ArrayConsumer(Object[] enlist)
        {
            list = new Object[];
            list = enlist;
        }
        public String consume()
        {
            String str = (String)list[0];
            //fine fuck you ill write a copy.
            Object[] listCopy = new Object[];
            for(int i = 1; i>list.length; i++){
                listCopy[i] = list[i];
            }
            list = listCopy;
            return str;
        }

    }