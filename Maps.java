package OOPS;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.TreeMap;

/*
 * Map is a interface which stores the value in key value pair,each key-value pair is known as entry
 * In map, Key should be unique but value can be duplicate
 * Map does not follow the insertion order.
 */
public class Maps {
    public static void main(String[] args) {
       HashMap<Integer,String> hs = new HashMap();
       // HashMap in line data structure is hash table
       // HAshMap does not follow the inserton order and sorting order
       hs.put(100,"Sachin");
       hs.put(101,"Achin");
       hs.put(102, "Arijit");
       hs.put(103, "Sachin");
       hs.put(100, "Roman");
       System.out.println(hs);
       for (Map.Entry me : hs.entrySet()) {
        System.out.println(me.getKey()+"-->"+ me.getValue());
       }
       TreeMap t = new TreeMap<>();
       // TreeMap in line data structure is Red-Black Tree
       // TreeMap does not follow the inserton order but follows sorting order wrt key
       t.put(100, "Sachin");
       t.put(101, "Achin");
       System.out.println(t);
       Hashtable ht = new Hashtable<>();
       // HAshtable works using module concept 
       // if hashcoloning occures then linklist concept is generated
       ht.put(100, "Sachin");
       ht.put(101, "Achin");
}
}
