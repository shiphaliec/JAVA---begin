import java.util.Arrays;

public class passingInFn {
    public static void main(String[] args)
    {
          
          int[] num = {49 , 54 ,67,34,21} ;
          System.out.println(Arrays.toString(num));
          change(num);
          System.out.println(Arrays.toString(num));
    }

    static void change(int[] arr)
    {
        arr[0] = 45;

    }
    
}
