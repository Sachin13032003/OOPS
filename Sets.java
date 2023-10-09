package OOPS;
import java.util.HashSet;
// Set is a interface that implements the collection interface
// sets canot store duplicate value
// sets are two type:-
// Hashset, LinkedHastSet
public class Sets {
    public static void main(String[] args) {
        HashSet h = new HashSet();
        h.add("Sachin");
        h.add("Sachin");
        h.add(100);
        h.add(10);
        System.out.println(h);
        // Hash set implemets the set interface 
        // hastset store the data on the basis of hash code
        // hashset follows the hashtable
        // Hashset doesnot follows insertion order
        // hash set is backup by Map
        // Hash set cannot store duplicate value
        // Hashset can store different data type
        // Hashset are non-synchronized data-structure
    }
}
