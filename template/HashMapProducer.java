package edu.sdccd.cisc191.template;
import java.util.HashMap;
public class HashMapProducer {
        private HashMap list;

        public HashMapProducer(HashMap enlist) {
           list = new HashMap<Object, Integer>();
            list = enlist;
        }

        public void produce(int i, String string) {
            list.put(string, (Integer) i);
        }
}
