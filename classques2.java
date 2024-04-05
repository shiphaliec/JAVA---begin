import java.util.Scanner;
public class classques2 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        boolean ans = armstrong(n);
       /// boolean ans = isPrime(n);
        System.out.println(ans);

    for(int i = 100 ; i<1000 ;i++)
    {
      if(armstrong(i)){
        System.out.println(i + " ");
      }
    }

    in.close();
    }

    static boolean armstrong(int n){
      int temp = n;
      int sum =0;
      while (n>0) {
      
        int rem = n % 10;
        n/=10;
        sum = sum+ rem*rem*rem;
        
      }
      return sum == temp;
    }



    /*static boolean isPrime(int n){
          if(n <= 1 )
          {
            return false;
          }
          int c = 2;
          while (c * c <= n) {
            if (n % c == 0) {
                return false;
            }
            c++;
          }  
          if (c*c>n) {
            return true;
          }  
          return false;
    }*/

   
  
}

