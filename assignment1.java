import java.util.Scanner;
public class assignment1 {
    public static void main(String[] args)throws Exception
    {
         Scanner input = new Scanner(System.in);

         // CALCULATE EVEN AND ODD

        //  System.out.println("Enter the number");
        //  int num = input.nextInt();
        //  if(num % 2 == 0)
        //  {
        //     System.out.println("The given number is even");
        //  }
        //  else{
        //     System.out.println("The given number is odd");
        //  }

        // PRINT A GREETING MESSAGE 
        
        // System.out.println("Enter the name :");
        // String name = input.nextLine();
        // System.out.println("Hi! Good Morning "+ name);
         
        // CALCULATE SIMPLE INTEREST 
        // System.out.println("enter the Principal , rate and time as well ");
        // int p = input.nextInt();
        // int t = input.nextInt();
        // int r = input.nextInt();
        // float SI = (p * r * t)/100;
        // System.out.println("The calculated Simple Interest is :" + SI);


        // ARITHMETIC CALCULATOR 

        // System.out.println("Enter two numbers :");
        // int a = input.nextInt();
        // int b = input.nextInt();
        // System.out.print("Enter operator (+,- , * , /)");
        // char op = input.next().charAt(0);
        // if( op == '+')
        // {
        //     System.out.println("Perform Addition :" + (a + b));
        // }
        // else if(op == '-')
        // {
        //     System.out.println("Perform Subtraction :" + (a-b));
        // }
        // else if(op == '*')
        // {
        //     System.out.println("Perform Multiplication : " + (a * b));
        // }
        // else {
        //     System.out.println("Perform Division :" + (a/b));
        // }


        // IDENTIFYING THE GREATEST NUMBER

        // System.out.println("Enter the two number : ");
        // int num1 = input.nextInt();
        // int num2 = input.nextInt();
        // if(num1 > num2)
        // {
        //     System.out.println("Num1 is greater than num2");
        // }
        // else{
        //     System.out.println("num2 is greater than num2");
        // }

        //CONVERTING INDIAN CURRENCY IN UNITED STATES DOLLORS

        // System.out.println("Enter the Indian Currency in rupees and the exchange rate as well:");
        // float rs = input.nextFloat();
        // float er = input.nextFloat();
        // float usd = rs * er ;
        // System.out.println("The rupees in Dollors :" + usd);

        // //CALCULATING FIBONACCI SERIES 
        // int a =0 , b =1 , c;
        // System.out.println("Enter the number till you want fibbonacci series : ");
        // int n = input.nextInt();
        // System.out.println("THe Fibonacci series is :" );
        // System.out.println(a + "," + b+ ",");
        // for(int i=0 ; i<n-2; i++)
        // {
        //     c = a +b ;
        //     System.out.println(c+ ",");
        //     a=b;
        //     b=c;
        // }

        // REVERSE OF THE NUMBER 

        // System.out.println("Enter the number :");
        // int num = input.nextInt();
        // int sum = 0;
        // while(num > 0)
        // {
        //     int r = num%10;
        //     sum = (sum * 10) + r;
        //     num = num /10;
        // }
        // System.out.println("the reversed number is : " + sum);

        // IDENTIFYING PALINDROME NUMBER

        // System.out.println("Enter the number : " );
        // int n = input.nextInt();
        // int temp = n;
        // int sum = 0;
        // while(n>0)
        // {
        //     int r = n % 10;
        //     sum = (sum * 10) + r;
        //     n = n /10;
        // }
        // if(temp == sum)
        // {
        //     System.out.println("Yes ! It is a palindrome Number");
        // }
        // else
        // {
        //     System.out.println("No! It is not a palindrome number");
        // }

        //  ARMSTRONG NUMBER
            
        System.out.println("Enter the number : ");
        int num = input.nextInt();
        int temp = num ;
        int length = String.valueOf(num).length();
        int sum=0;
        while(temp>0){
            int lastdigit = temp % 10;
            sum += Math.pow(lastdigit, length);
            temp = temp / 10;
        }
        if(num==sum)
        {
            System.out.println("The given number is Armstrong number");
        }
        else{
            System.out.println("The given number is not an armstrong number");
        }

        input.close();
    }   
}
