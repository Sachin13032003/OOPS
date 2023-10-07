package OOPS;
import java.util.ArrayList;
import java.util.List;

public class Iterator {
    public static void main(String[] args) {
        List l = new ArrayList();
        l.add(0, 6);
        l.add(1, 2);
        l.add(2, 5);
        l.add(002);
        java.util.Iterator itr = l.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
    
}
