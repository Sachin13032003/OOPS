package OOPS;
// Strings are the sequence of of character and Strings are immutable in java
// Strings are secure 
// String is a class in java
//String constant pool can not work in garbage collection because they are internaly control  by the JVM
// When we create string using this structures 
// String s ="sachin" --> it will create one object in the SCP which is under the heap memory
// String s = new String("Sachin") --> it will create 2 objects ,one in the SCP and another one in the heap memory
public class String_Details {
    public static void main(String[] args) {
        // String s ="sachin";
        // String s1 = new String("Sachin");
        // String s2= "Sachin";// it will point to the same object
        // // String Methods
        String a= new String("Achin");
        String b=  new String("Achin");
        System.out.println(a==b);// it will print false because here two different object is created in the heap memory
        // == works on the reference comaprision 
        System.out.println(a.equals(b));
        String a1="Sachin";
        String a2="Sachin";
        System.out.println(a1==a2);// it will print true because here one object is created and the variable pointing to the same object 
        System.out.println(a1.equals(a2));
        // .equals method compares two strings, and returns true if the strings are equal, and false if not.
        // StringBuffer
        // StringBuffer Objects are muttable  and they are synchronized and if we concat the String buffer it will not create new object 
        // StringBuilder and StringBuffer are same only StringBuilder create a unSynchronized method 
    }
}
