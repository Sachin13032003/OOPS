package OOPS;
/* if we create userdefine exception as checked exception it is mandatory to declair try catch or throws keyword to the caller method
if we declaire userdefined exception as unchecked exception then it is easy to maintain
*/
public class Userdefined_Exception {
    public static void main(String[] args) throws Read// throws ExceptionClassName 
     {
    int age =17;
    try{
    if(age<18){
        throw new Read();
    }
}
catch(Read e){
    e.printStackTrace();//either declair this or throws 
}
        
    }
    
}
class Read extends Exception{
    Read(){
        super("you are under age")
    }
}
