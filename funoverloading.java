public class funoverloading { // two things should be considered while having same name 
    //1) either the number of arguments OR 2) the type of arguments
    public static void main(String[] args) {
        fun(45);
        fun("Shiphali", 67);
    }
    static void fun(int x){
        System.out.println(x);
    }
    static void fun(String name , int y){
        System.out.println(name );
        System.out.println(y);
    }
}
