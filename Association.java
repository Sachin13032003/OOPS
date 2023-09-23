package OOPS;

public class Association {
    static class college{
        void show(){
            System.out.println("i am the college");
        }
    }
    static class prof{
        college ob1 =new college();
        //here the relatonship is created with the creation of a object with the help of the new keyword
        //we can access all the proprety of other class without inheriting the class 
        void show(){
            ob1.show();
            System.out.println("i am the professor");
        }
    }
        static class branches{
            void show(){
                college ob =new college();
                ob.show();
                System.out.println("i am Cse and it");
            }
        }
        public static void main(String[] args) {
            prof pf =new prof();
            pf.show();
            branches bf =new branches();
            bf.show();
        }
    
    
}
