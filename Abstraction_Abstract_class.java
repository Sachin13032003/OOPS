package OOPS;
// Abstraction can be done in two ways 
// 1. Abstract class(0-100%)
//2 . interfaces(100%)
// in abstraction  we also use the method overriding concept

public class Abstraction_Abstract_class {
public static void main(String[] args) {
    car c= new car();
    c.start();
    scotter s  =new scotter();
    s.start();
    //Vehicle v =new Vehicle();
    // we can not create a object of a abstract class
}    
}
abstract class Vehicle{
    int no_tyre;
    // if we declare a absttract  method in a class  then it is mandatory to declare the class also as a abstract
    abstract void start();
    void st(){
        System.out.println("hello");
    }
}
class car extends Vehicle{
    // if we inherite a abstract class then we  also have to declare the methods over there
    void start(){
        System.out.println("car starts with key");
    }
}

    class scotter extends Vehicle{
        void start(){
            System.out.println("scotter starts with kick");
        }
    }