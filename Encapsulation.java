package OOPS;
//Data hiding and binding of data ,variables and method into a single unit
//Encapsulation required -->
// the data to be declare as private
// Getter and Setter method 

public class Encapsulation {
    static class Employee{
        private int empid;//hiding the data
        public void setempid(int eid){
            empid=eid;//using setter method 
        }
        public int getempid(){
            return empid;//using getter method
        }
    }
    public static void main(String[] args) {
        Employee e =new Employee();
        e.setempid(100);
        System.out.println(e.getempid());
    }
    
}
