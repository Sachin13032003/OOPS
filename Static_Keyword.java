package OOPS;
// Static key word is used for memory management
// for static variable we can access the variable in  the class and through class name at any where
// Static variable are dependent on class ,not in object 
// if a method is static then the variable under this method should be static 

public class Static_Keyword {
    static int a =10;
    public static void main(String[] args) {
        Employee e1 =new Employee(100,"sachin","TCS");
        e1.display();
         Employee e2 =new Employee(101,"achin","TCS");
          Employee e3 =new Employee(102,"arijit","TCS");
          e2.display();
          e3.display();
          Employee.display();// We can call the static method by only the name 
    }
}
class Employee{
    static int count=0;
    int eid;
    String name;
    static String company= "TCS";
    public Employee(int eid, String name, String company) {
        count++;
        this.eid = eid;
        this.name = name;
    }
 static void display(){
       // System.out.println(eid+" "+name+" "+company);
        System.out.println(Static_Keyword.a);// We can access the static variable outside the class by class name 
        System.out.println(count);    
    }
}


