import java.util.Arrays;
//import java.util.Scanner;
public class Funny {
    public static void main(String[] args)throws Exception
    {
      
        /*greeting();
        int ans = sum1();
        System.out.println(ans);*/

        // ans = sum(78 ,342);
        //System.out.println(ans);

        /*String msg = greet("Shiphali Chaurasia");
        System.out.println(msg);*/

        /*String name = "kunal";
         swap(name);
        System.out.println(name);*/

        int[] arr = {0, 54, 43, 41};
        changearr(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void changearr(int[] num){
        num[0] = 99; // if you change the object via this reference variable , same object will be changed
    }

    /*static void swap(String naam){
         naam = "Rahul Rana" ; // not modifying ; creating a new object
    }
    /*static String greet(String name)
    {
        String personalised = "Hello " + name;
        return personalised;
    }

    // pass the value of numbers when you are calling the method
    /*static int sum(int a, int b){
        int add = a + b;
        return add;
    }
    /*static int sum1(){
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        int n2= in.nextInt();
        int sum = n1 + n2;
        return sum;

    }
    static void greeting() {
        System.out.println("hi");
    }*/

    
}
