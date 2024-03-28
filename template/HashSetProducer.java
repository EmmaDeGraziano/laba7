package edu.sdccd.cisc191.template;
import java.util.HashSet;
public class HashSetProducer {
        private HashSet list;

        public HashSetProducer(HashSet enlist) {
            list = new HashSet<Object>();
            list = enlist;
        }

        public void produce(int i, String string) {
           list.add(string);
        }
}
