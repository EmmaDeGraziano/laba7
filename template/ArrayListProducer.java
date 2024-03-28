package edu.sdccd.cisc191.template;
import java.util.ArrayList;

public class ArrayListProducer {
    private ArrayList list;

    public ArrayListProducer(ArrayList enlist) {
        list = new ArrayList<Object>();
        list = enlist;
    }

    public void produce(int i, String string) {

        list.add(i, string);

    }
}