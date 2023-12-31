package OOPS;

import java.util.ArrayList;
import java.util.LinkedList;
//import java.util.Vector;
import java.util.Stack;


// List is a interface that implements Collection interface there are three types of list:-
// ArrayList , LinkList and Vector(legacy class)
// Under the vector class stack is there and stack is also a legacy class
public class Lists {
    public static void main(String[] args) {
        ArrayList a = new ArrayList();
        // ArrayList is on the basis of array but it is growable or resizeable on the formula of (old_size *3)/2+1
        // ArrayList is non-synchronized and it follows the insertion form
        // it contains hetrogenious data 
        a.add(10);
        a.add(100);
        a.add("Sachin");
        System.out.println(a);
        LinkedList l = new LinkedList();
        // LinkList is on the basis of Doubly linklist and circular linklist 
        //LinkList is non-synchronized and it also follows the insertion form
        // it conatains hetrogenious data  
        l.add(10);
        l.add(100);
        l.add('c');
        l.add("sachin");
        System.out.println(l);
      //  Vector v = new Vector();
      // vector implements the list and deque and but it folllows the formula (old_size*2)
      // vector is synchronized
      // it contains also hetrogenious data
       //   v.add(10);
       Stack s = new Stack<>();
       // Stack is a legacy class and child class of vector class
       // Stack implements using array , arraylist,linkedlist and vector
       // stack is also a indexbased datastructure
       s.push("Sachin");//it add the data in the stack
       s.push("Achin");
       s.push(100);
       s.push(101.20);
       System.out.println(s);
       System.out.println(s.pop()); // this operation delete the top of the stack data
       System.out.println(s);
       System.out.println(s);
       System.out.println(s.peek());// this operation return the top of the stack
       System.out.println(s);


    }
    
}
