package OOPS;

public class Constructer {
    int i;
   public static void main(String[] args) {
    Constructer ob = new Constructer();
    //Here a default constructer is created by the compiler to intialize the object
    System.out.println(ob.i);
    student ob1 =new student("sachin", 1, 12);
     student ob2 =new student("achin", 2, 10);
     System.out.println(ob1.name);  
}
   static class student{
     int cl;
     int roll;
     String name;
     //Here we create a parameteriged constructer

    student(String name,int roll,int cl){
      this.name=name;
      this.roll=roll;
      this.cl=cl;
    }
   } 
}
