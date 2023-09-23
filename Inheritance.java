package OOPS;
//sinlge level inheritance
public class Inheritance {
    static class parent{
        //Here static keyword is used because of inner class 
        // =if we dedclare the class outside then we don't have to mention the class as static
        public int prop=10000;
        void show(){
            System.out.println("i have the property of"+ prop);
        }
    }
   static class child extends parent{
    //Here we declare inheritance of prop variable
    //extends keyword use to the inherit the other class 
         void show(){
            System.out.println("i have the property of "+(prop+10000));
         }
    }

 public static void main(String[] args) {
        parent ob =new parent();
        child ob1 =new child();
        ob.show();
        ob1.show();
        
    }
}
    
