//import java.lang.Math;
import java.util.Scanner;
public class assignment3 {
    public static void main(String[] args)throws Exception
    {
        Scanner in = new Scanner(System.in);

        // FACTORIAL PROGRAM

        /*System.out.println("Enter the number you want to calculate of :");
        int n= in.nextInt();
        int fact = 1;
        if(n!=0)
        {
        for( int i = 1; i<=n ; i++)
        {
            fact *= i  ;
        }
        System.out.println(fact);
        }
        else{
            System.out.println("Factorial is 1");
        }*/

        // Calculating electricity bill
        /*
        
        System.out.println("Enter previous month reading in kWh :");
        float pmr = in.nextFloat();
        System.out.println("Enter current month reading in kWh :");
        float cmr = in.nextFloat();
        float energcon = cmr - pmr ; 
        System.out.println("Enter the tariff rate :");
        float tariffrate = in.nextFloat();
        double Tenergycon = energcon * tariffrate ;
        System.out.println(" Total Energy Consumption :" + Tenergycon);*/

        // AVERAGE CALCULATION 

        /*System.out.println("Enter the number you want to calculate average of :");
        int n = in.nextInt();
        float sum = 0;
        for(int i = 1; i<=n ; i++)
        {
            System.out.println("Enter number");
            int num = in.nextInt();
            sum +=num ;
        }
        float avg = sum / n;
        System.out.println(" The average is :" + avg);*/

        // DISCOUNT OF PRODUCT 
        /*System.out.println("Enter the list price and the discount as well ");
        int Lprice = in.nextInt();
        int Dprice = in.nextInt();
        float discountper =((float)(Dprice) / Lprice ) * 100 ;
        System.out.println("THe discount percentage is :" + discountper + "%" ); */

        // DISTANCE BETWEEN TWO POINTS 
        /*System.out.println(" Enter the two x - coordinate (x1, x2)");
        int x1 = in.nextInt();
        int x2 = in.nextInt();
        System.out.println("Enter the y - coordinate (y1, y2)");
        int y1 = in.nextInt();
        int y2 = in.nextInt();
        double d = (double)Math.sqrt(((x2 -x1) * (x2 - x1)) + ((y2 - y1) * (y2 - y1)));
        System.out.println("The distance between two points :" + d); */

        // COMMISSION PERCENTAGE 
        /* 
        System.out.println("Enter the total commision amount and total sales or revenue :" );
        float commiamount = in.nextFloat();
        int Tsale = in.nextInt();
        float Crate = (float) (commiamount / Tsale) * 100;
        System.out.println("The Commission rate is :" + Crate + "%"); */

        // Power
        /*System.out.println("Enter the work done in joule and the time taken to complete ");
        float W = in.nextFloat();
        float T = in.nextFloat();
        float P = W * T;
        System.out.print(" THe Power is :" + P + "W");*/

        // DEPRECIATION VALUE 
        /* 
        System.out.println("Enter the original cost along with residual value as well as it's useful life");
        int Orig = in.nextInt();
        int ResiVal = in.nextInt();
        int UseLife = in.nextInt();
        float depre = (Orig = ResiVal) / UseLife ;
        System.out.println("Depreciation per year is" + depre); */

        // BATTING AVERAGE
        // System.out.println("Enter the total runs scored by bat ans total at bats");
        // int RunScore = in.nextInt();
        // int Atbat = in.nextInt();
        // double battingAvg = (double)RunScore / Atbat ; 
        // System.out.println("BATTING AVERAGE : " + battingAvg);
        

        //CGPA CALCULATION

        /*System.out.println("Enter the total percentage along with number of semester completed :");
        int sem = in.nextInt();
        double Totalper = 0;
        for(int i = 1;i<=sem;i++)
        {
            float per = in.nextFloat();
            Totalper += per;
        }
        double CGPA = Totalper / sem  / 9.5 ;
        System.out.println("The CGPA is :" + CGPA);*/

        // COMPOUND INTEREST 

        /*System.out.println("Enter the  principle , rate and time to calculate Amount:");
        int P = in.nextInt();
        float r = in.nextFloat();
        int t = in.nextInt();
        double Amount = P * Math.pow(1 + ((double)r / 100) , t);
        System.out.println("The calculated amount is :" + Amount);
        Double CI = Amount - P ;
        System.out.println(" The Compound Interest is : " + CI);*/

        // AVERAGE MARKS 
        /*System.out.println("Enter the total subject to find the average marks : ");
        int sub = in.nextInt();
        double sum =0;
        int marks;
        for(int i=1 ; i<=sub ; i++)
        {
            marks = in.nextInt();
            sum += marks;
        }
        double Avg = sum /sub;
        System.out.println("The average of n numbers is :" + Avg);*/

        // Sum of N numbers 

        /*System.out.println("Enter the n number to be summed up :");
        int n= in.nextInt();
        double sum = 0;
        for(int i = 1; i<=n; i++)
        {
            System.out.println("Enter the numbers:");
            int num = in.nextInt();
            sum += num;
        }
        System.out.println("The sum is :" + sum);*/
        // ARMSTRONG NUMBER 

        /*System.out.println("Enter the number :");
        int num = in.nextInt();
        int temp = num;
        int length = String.valueOf(num).length();
        int sum = 0;
        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, length);
            temp = temp / 10;
        }
        if(sum == num)
        {
            System.out.print("It is an armstrong number");
        }
        else{
            System.out.println("It is not an armstrong number");
        }*/
 

        // PERMUTATION AND COMBINATION

        /*System.out.println("Enter the n and r to calculate nPr and nCr :");
        int n = in.nextInt();
        int r = in.nextInt();
        long fact_n =1 ;
        long fact_r =1;
        long fact_k =1;
        int n_minus_r = n - r;
        for(int i =1;i<=n;i++)
        {
            fact_n = fact_n * i;
        }
        for(int j = 1;j<=n_minus_r ;j++)
        {
            fact_r = fact_r * j;
        }
        long nPr = fact_n / fact_r;
        System.out.println("The Permutation of two parameters :" + nPr);
        for(int k = 1; k<=r;k++)
        {
            fact_k *= k;
        }
        long nCr = nPr / fact_k ;
        System.out.println("The combination of two parameters :" + nCr);*/

        //REVERSED THE GIVEN STRING 

        /*System.out.println("Enter a String :");
        String name = in.nextLine();
        String eman = " ";
        char ch;
        for(int i =0;i<name.length();i++)
        {
            ch = name.charAt(i);
            eman = ch + eman;
        }
        System.out.println("The reversed string : " + eman);*/

        // PALINDROME NUMBER 

        /*System.out.print("Enter a number to check :");
        int num = in.nextInt();
        int temp = num;
        int sum = 0;
        while(num > 0)
        {
            int r = (num % 10);
            sum = (sum * 10) +r;
            num = num / 10;
        }
        if(temp==sum)
        {
            System.out.println(temp + " is a palindrome number.");
        }
        else{
            System.out.println(temp + " is not a palindrome number");
        }*/
        // FUTURE INVESTMENT VALUE

        /*System.out.println("Enter the Present investment value, rate and number of years");
        float P = in.nextFloat();
        int r = in.nextInt();
        int t = in.nextInt();
        float FV = ( P * r * t) + P;
        System.out.println("The Future Investment value is" + FV); */

          //LCM AND HCF OF TWO NUMBERS

        /*System.out.println("Enter two numbers :");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int hcf = 0;
        for(int i =1;i<=num1 || i<=num2 ; i++)
        {
            if(num1%i==0 && num2%i==0)
            {
                hcf=i;
            }
        }
        System.out.println("The hcf of the two numbers " + num1 + " and " + num2 + " is 50" + hcf);

        int lcm = (num1 * num2) / hcf;
        System.out.println("The LCM of numbers is : "+ lcm); */


        // VOWELS OR CONSONANTS

        /*System.out.println("Define a String :");
        String str = in.nextLine();
        String strlc = str.toLowerCase();
        int vcount = 0;
        int ccount = 0;
        for(int i=0; i<strlc.length();i++)
        {
            char ch = strlc.charAt(i);
            if(ch == 'a' || ch== 'e' || ch == 'i' || ch == 'o' || ch == 'u')
            {
                  vcount++;
            }
            else{
                ccount++;
            }
        }
        System.out.println("Vowels and Consonants :" + vcount +" and " + ccount); */

        //PERFECT NUMBER

        /*System.out.println("Enter the number :");
        int n = in.nextInt();
        int sum =0;
        for(int i=1; i<n ;i++)
        {
            int rem = n % i;
            if(rem == 0)
            {
                sum += i;
            }
            else{
                continue;
            }
        }
        if(sum == n)
        {
            System.out.println("It is a perfect number");
        }
        else{
            System.out.println("It is not perfect number");
        }*/

        // CHECK LEAP YEAR OR NOT

        /*System.out.println("Enter the year to check leap year or not :");
        int yr = in.nextInt();
        if(yr % 4 ==0 || yr % 400 ==0)
        {
            System.out.println(yr + " is a leap year");
        }
        else{
            System.out.println(yr + " is not a leap year");
        }*/

        //Sum of Digits

        /*System.out.println("Enter the number :");
        int num = in.nextInt();
        int sum = 0;
        int temp = num;
         while(num != 0)
         {
            int digit = num % 10;
            sum += digit;
            num /= 10;
         }
         System.out.println("The sum of digits of a number " + temp + " is " + sum); */

         // count number of days ina month on which kunal can go outside

         /*System.out.println("There are 31 days in the month of August");
         int days = 31;
         int ecount = 0 ,ocount =0 ;
         for(int i =1;i<=days;i++)
         {
            if(i % 2 == 0)
            {
                ecount++;
            }
            else{
                ocount++;
            }
         }
         System.out.println("The number of days on which kunal can go is " + ecount + " and on not  " + ocount); */

         System.out.println("Enter the list of numbers : either positive even or positive odd and negative ");
         int  sum = 0;
         while (true) {
            int num = in.nextInt();
            if(num == 0)
            {
                break;
            }
            else{
                sum += num;    
            }
         }
         System.out.println("The sum is ::" + sum);  
         in.close();

    }
    
}
