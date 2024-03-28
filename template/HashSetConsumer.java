package edu.sdccd.cisc191.template;
import java.util.HashSet;
import java.util.Iterator;
public class HashSetConsumer {
        private HashSet list;
        public HashSetConsumer(HashSet enlist)
        {
            list = new HashSet<Object>();
            list = enlist;
        }


        public String consume()
        {
            Iterator<Object> repeat=  list.iterator();
            String str = (String)repeat.next();
            list.remove(0);
            return str;
        }
}
