package OOPS;
//import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;
// Set is a interface that implements the collection interface
// sets canot store duplicate value
// sets are two type:-
// Hashset, SortedSet
public class Sets {
    public static void main(String[] args) {
        // HashSet h = new HashSet();
        // h.add("Sachin");
        // h.add("Sachin");
        // h.add(100);
        // h.add(10);
       // System.out.println(h);
        // Hash set implemets the set interface 
        // hastset store the data on the basis of hash code
        // hashset follows the hashtable
        // Hashset doesnot follows insertion order
        // hash set is backup by Map
        // Hash set cannot store duplicate value
        // Hashset can store different data type
        // Hashset are non-synchronized data-structure
        TreeSet t = new TreeSet();
        // Tree set implements the navigable interface
        // Tree set follows the balanced tree data structure
        // Tree set follows the sorting order and doesnot follows the insertion order.
        // Tree set can not store duplicate value
        // Tree set contain homogenious data
        // Tree set is a non-synchronized data structure

        // t.add(50);
        // t.add(10);
        // t.add(60);
        // t.add(25);
       // System.out.println(t);
       System.out.println("Enter the size of the array:- ");
       Scanner sc = new Scanner(System.in);
       int a = sc.nextInt();
       while(a>0){
        t.add(sc.nextInt());
        a--;
       }
       System.out.println(t);
    }
}
