import java.util.Arrays;

public class shadowing { // showdoing is the practice of using two variables with the same name within the the scope that overlapse
   /*  static int x = 90;// this is shadowed at line 6 because lower level is overriding the upper level
     // cannot use object dependent things with object independent things
    public static void main(String[] args)throws Exception{
          System.out.println(x);  // accessing the object independent thing
          int x = 40;
          System.out.println(x); // scope will begin when value is initialized   //accessing the local variable
          fun();
    }
    static void fun(){
        System.out.println(x);   // trying to access the object independent
    } */


    //              VARIABLE LENGTH ARGUMENTS (  VAR ARGS)
    /*public static void main(String[] args) {
        fun(34,43,67,3423,87,54,765,3645,776,3,6,86,865,34,23,00);
        fun(); //empty array
    }

    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }*/
    
    public static void main(String[] args)
    {
         multiple(2 , 3, "ds" , "Shiphali");
    }
    static void multiple(int a , int b, String ...v){
        System.out.println(a);
        System.out.println(b);
        System.out.println(Arrays.toString(v));
    }
}
