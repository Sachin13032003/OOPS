package OOPS;
//Here we discuss Method overloading and Method Overriding also
//Compile time polymorphism perform using method overloading
//Run time polymorphism perform using method overriding
public class Polymorphism {
   // static class Test{
        // Through method overloading
       /*  //we can create same name method in same name class  but we  have initialize it through different argument 
        //if we change the return type of the method  it will give error -->
        // int show(){
        //     System.out.println("3");
        //}
        //we can perform method overloading through changing the arguments type, sequence and no of arguments
        void show(int a ,float b){
            System.out.println("1");
        }
        // if the number of argument is greater than 1 and if it is in the condition of auto promotion then it will give  an ambigious error
        void show(int a ){
            System.out.println("3");

        }
        //if we declare object class  as a argument we know that object class is the parent class of all classes 
        void show(Object a ){
            System.out.println("4");
        }
        void show(String a){
            System.out.println("String mehtod");
        }
        void show(StringBuffer a){
            System.out.println("String buffer method");
        }
        void show(int... a){
            System.out.println("vararg method");
        }
    }
    public static void main(String[] args) {
        Test t =new Test();
        t.show(10);
        t.show('a');
        t.show("abc");
        t.show(new StringBuffer("abc"));
        //if we pass a argument that's method is not there then it will perform the code on the bvasis of automatic promotion 
    // so if we pass an argument it will prefer child class for execute
    }
    
}*/
//Through method over riding
/* static class Test{
        void show(){
            System.out.println("method overriding");
        }
        // if we use access mofifier then we have to give higher property to the child class
        // different return type can be used in overriding
    }
    static  class  Tset1 extends Test{
        void show(){
            System.out.println("Method overriding");
        }
    }
    public static void main(String[] args) {
        Test t =new Test();
        t.show();
        Tset1 tt =new Tset1();
        tt.show();
    } */

}