import java.util.Scanner;
public class classques {
    public static void main(String[] args)throws Exception
    { 
        Scanner in = new Scanner(System.in);
       // System.out.println("Enter the numbers:");
        // int a = in.nextInt();
        // int b = in.nextInt();
        // int c= in.nextInt();
        // Ques : Find the largest of three numbers

        /* if(a>b && a>c)
        {
            System.out.println("a is the greatest");
        }
        else if(b > c && b>a)
        {
            System.out.println("B is the the greatest");
        }
        else{
            System.out.println("c is the greatest");
        } */

        // OR 
        
        /* 
        int max =a;
        if(b>max)
        {
            max =b;
        }
        if(c>max)
        {
            max = c;
        }
        System.out.println(max);

        */

        // OR

       /* int max =0 ;
        if(a>max){
            max =a;
        }
        else{
            max = b;
        }
        if(c>max)
        {
            max =c;
        }
        System.out.println(max);
        */ 

        //OR

       /* int max = Math.max(c , Math.max(a ,b ));
        System.out.println(max);*/

        // CHECKING LOWERCASE AND UPPERCASE

       /*  char ch = in.next().trim().charAt(0);
        if(ch >= 'a' && ch<= 'z'){
            System.out.println("LOWER CASE");
        }
        else{
            System.out.println("UPPERCASE");
        }
 */
       // Find the fibbonacci no

     /*  int n =in.nextInt();
       int a =0, b=1;
       System.out.println(a + "," + b + ",");
       for(int i =0 ;i<n-2;i++)
       {
           int c = a+b;
           System.out.println(c + ","); 
           a = b;
           b = c;
       } */
       
       // TO COUNT THE TIMES OF A REPEATED NUMBER

     /*  int n = 13839;
       int count = 0;
       while (n>0)
       {
        int rem = n % 10;
        if (rem==3) {
            count++ ; 
        }
        n= n/10;
       }
       
       System.out.println(count); */

       //REVERSE OF A NUMBER

  /*    int n = in.nextInt(); 
       int sum = 0;                 //sum = 0
       while (n>0) {                //2767 > 0
        int r = n % 10;             //r = 2797 % 10 = 7
        sum = (sum * 10 )+ r;       //sum = (0*10)+7
        n = n / 10;                 //n = 2797 / 10 
       }
       System.out.println(sum);
        */
      
       int ans = 0;
       while(true)
       {
        System.out.println("Enter the operator :");
        char op = in.next().trim().charAt(0);
        if(op == '+' || op == '-' || op == '*' || op == '/')
        {
            System.out.println("Enter two numbers : ");
             int num1 = in.nextInt();
             int num2 = in.nextInt();
             if(op == '+')
             {
                System.out.println("Addition" + (num1 + num2));
             }
             else if(op == '-')
             {
                System.out.println("Subtraction" + (num1 - num2));
             }
             else if(op == '*')
             {
                System.out.println("Multiplication" + (num1 * num2));
             }
             else
             {
                if(num1 != 0)
                        System.out.println("Division + (num1 / num2)");
                 }  
        }
        else if(op == 'X' || op == 'x'){
                  break;
            }
        else{
            System.out.println("Invalid Operation");
        }
        System.out.println(" This is calculated result :" +ans);
       }
    
      in.close();


       

    }

    
}
