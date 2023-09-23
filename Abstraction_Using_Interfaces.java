package OOPS;
// Interfaces are used to acheive the abstraction
// Interface also use method overriding
// Interface are loosely coupled
// Interface gives the multiple inheritance property  in java
interface i2{
    void display();
}
class  test implements i1,i2{
    public void display(){

    }
    public void show(){
        
    }
}

public class Abstraction_Using_Interfaces {
    public static void main(String[] args) {
        //we can not create a object of a interface //interface s= new interface();
        a t =new A();
        t.show();
    }
}
interface i1{
    //field
    // Here the field is public static final type
    int a=10;
    //method
    // Here teh method is public abstract type
    void show();
    default void run(){
        System.out.println("1");
    }
}
class a implements i1{
    //if we inherit a interface then we have declare the methods of interfaces in class 
    //the method in the class shuould be public because in the interfaces th method is public abstract type
    public void show(){
            System.out.println("1");
    }
}
