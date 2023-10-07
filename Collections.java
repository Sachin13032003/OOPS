package  OOPS;
/*
 * The Collection in Java is a framework that provides an architecture to store and manipulate the group of objects.
 A Collection represents a single unit of objects, i.e., a group.
 Framework provides readymade architecture.
It represents a set of classes and interfaces.
It is optional.
 */
import java.util.ArrayList;
public class Collections{
public static void main(String[] args) {
    ArrayList a= new ArrayList<>();
    a.add(10);
    a.add(100);
    a.add(200);
    System.out.println(a);
    ArrayList a1 =new ArrayList<>();
    a1.add(20);
    a1.add(200);
    a1.addAll(a);
    System.out.println(a1);
    a.clear();
    System.out.println(a);
}
}