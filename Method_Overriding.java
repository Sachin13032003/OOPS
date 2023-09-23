package OOPS;
// For overriding these condition follow
// same method name
// different class
// same argument according to their no,type and sequence
// Inheritance

public class Method_Overriding {
    static class Test{
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
    }
    
}
