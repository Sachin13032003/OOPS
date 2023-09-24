package OOPS;
//Super keyword is also a reference variable
//it invokes parent class reference variable or method
// super keyword comes at the time of inheritance
//super() is used at teh time of constructer 
public class Super_Keyword {
    public static void main(String[] args) {
        b t= new b();
        t.show();
    }
}
class superdemo{
    int i=10;
    void show(int i){
        this.i=i;
        System.out.println(i);
    }
    superdemo(){
        System.out.println("i am in class super");
    }
}
class b extends superdemo{
    int i=20;
    void show(){
         super.show(40);// We can call the parent class method in child class through super keyword
        System.out.println(i);
        System.out.println(super.i);//it will print the parent class i value
    }
    b(){
        //super(); // it will default called by the compiler
System.out.println("I am in class b");// At first it will go to the parent class constructer then it come at here
    }

}
