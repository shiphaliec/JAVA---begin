import java.util.Scanner;
public class assignment4 {

    // FIND GREATEST AMONG 3 NUMBERS 
    /*public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        // method1(a , b ,c);
        int result = method2(a, b, c);
        System.out.println(result);
    }
    /*static int method1(int a , int b, int c){
        int max;
        if(a > b && a > c)
        { 
            max = a;
            System.out.println(a + " is the greater");
        }
        else if(b > a && b > c)
        {
            max = b;
            System.out.println(b + " is the greater");
        }
        else{
            max = c;
            System.out.println(c + " is the greater");
        }
        return max;
    }
                       ANOTHER METHOD

    static int method2(int a ,int b, int c)
    {
         int max = Math.max(a, Math.max(b, c));
         return max;
    }*/

    /*public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        evenOdd(num);

    }

    //  CHECK EVER OR ODD

    static void evenOdd(int num){
        if(num % 2 == 0)
        {
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }*/

    /*public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int age = in.nextInt();
        vote(age);
    }

    //ELIGIBILITY CRITERIA FOR VOTE

    static void vote(int age){
        if (age < 18) {
            System.out.println("Is not Eligible to vote");
        }
        else if(age >= 18) {
            System.out.println("Eligible to vote");
        }
    }*/

    //ADDITION OF TWO NUMBERS

    /*public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a =in.nextInt();
        int b = in.nextInt();
        int result = sum(a, b);
        System.out.println(result);
    }

    static int sum(int a , int b){
        int add = a + b;
        return add;
    }*/

    // PRODUCT OF TWO NUMBERS

    /*public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int result = product(a , b);
        System.out.println(result);
    }

    static int product(int a, int b){
        int multiply = a * b;
        return multiply ; 
    }*/

    // CIRCUMFERENCE AND AREA OF CIRCLE

    /*public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int radius = in.nextInt();
        double c = circle(radius);
        System.out.println( "Circumference is : " + c);
        double a = circle1(radius);
        System.out.println("Area is :" + a);
    
    }

    static float circle(int radius){
            double circumference = 2 * Math.PI * radius;
            return (float)circumference;
    }
    static float circle1(int radius){
        double area =(double) Math.PI * radius * radius ;
        return (float)area ;  
    }*/

    //  TO CHECK NUMBER IS PRIME OR NOT

    /*public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        boolean ans = isprime(num);
        System.out.println(ans);
    }

    static boolean isprime(int num){
        if (num <=  0) {
            return false;
        }
        int c = 2;
        while (c * c <= num) {
            if (num % 2 == 0) {
                return false;
            }
            c++;
        }
        if(c * c > num)
        {
            return true;
        }
        return false;
    }*/


    // GRADING

    /*public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float marks = in.nextFloat();
        grades(marks);
    }

    static void grades(float marks){
        if (marks >= 91 && marks <= 100) {
            System.out.println("Grade AA");
        }
        else if (marks >= 81 && marks <= 90) {
            System.out.println("Grade AB");
        }
        else if (marks >= 71 && marks <= 80) {
            System.out.println("Grade BB");
        }
        else if (marks >=61 && marks <= 70) {
            System.out.println("Grade BC");
        }
        else if (marks >=51 && marks <=60) {
            System.out.println("Grade CD");
        }
        else if (marks >=41 && marks <=50) {
            System.out.println("Grade DD");
        }
        else if(marks < 41){
              System.out.println("Fail");
        }
    }*/

    //          FACTORIAL OF A NUMBER

    /*public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int ans = factorial(num);
        System.out.println(ans);

    }

    static int factorial(int num){
        if(num <= 0){
            System.out.println("Enter a positive number");
            return 0;
        }
        else{
        int fact = 1;
        for(int i = 1; i<= num;i++){
            fact *= i;
        }
        return fact;
    }
    }*/

    //           PALINDROME NUMBER

    /*public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        isPalindrome(num);

    }

    static boolean isPalindrome(int num){
        int temp = num;
        int rnum = 0;
        while (num != 0) {
            int digit = num % 10;
            rnum = rnum * 10 + digit;
            num /= 10;
        }
            if (temp == rnum) {
                System.out.println(temp + " is Palindrome");
                return true;
            }
            else{
                System.out.println(temp + " not a palindome");
                return false;
            }  
    }*/

    // PYTHAGORIAN TRIPLET

    /*public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextShort();
        int b = in.nextInt();
        int c = in.nextInt();
        pythagoras(a, b, c);
    }

    static int pythagoras(int a ,int b, int c){
        int sum = (int)Math.sqrt(a * a + b * b);
        if(c * c == sum * sum)
        {
            System.out.println("pythagorean Triplet");
            return 0;
        }
        else{
            System.out.println("Not a pythagorean Triplet");
            return 0;
        }

    }*/  

    //      PRIME NUMBERS BETWEEN TWO NUMBERS
    
    /*public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        Prime(a, b);
        // System.out.println(ans);
    }

    static void Prime(int a , int b){
        int c = 2;
        for(int i = a;i<=b;i++)
        {
            if(isPrime(i)){
                System.out.println(i);
            }
        }
    }

    static boolean isPrime(int n){
        if(n <= 1){
            return false;
        }
        for(int i=2;i * i<=n ; i++)
        {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }*/


    // SUM OF N NATURAL NUMBER

    /*public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int ans = sum(num);
        System.out.println(ans);
    }

    static int sum(int num){
        int sum = 0;
        for(int i = 1;i<=num;i++)
        {
            sum += i;
        }
        return sum;
    }*/
    
}
