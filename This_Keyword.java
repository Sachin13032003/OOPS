package OOPS;
//this keyword means it is the reference variable of a that class 
// this keyword invoke current class reference variable;
public class This_Keyword {
    public static void main(String[] args) {
        thisdemo t =new thisdemo();
        t.show(10);
    }
}
 class thisdemo{
    int i;
    void show(int i){// if we provide argument name as i then it will print default value of i
    this.i=i;
    System.out.println(i);
    }
}
