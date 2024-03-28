package edu.sdccd.cisc191.template;

import java.util.Arrays;

public class ArrayProducer {
    private Object[] list;

    public ArrayProducer(Object[] enlist) {
       list = new Object[];
        list = enlist;
    }

    public void produce(int i, String string) {
        list[i] = string;
    }
}
