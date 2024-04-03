import java.util.Scanner;
public class TypeCasting {
    public static void main(String[] args)throws Exception
    {
        Scanner input = new Scanner(System.in);
        // float num1 = input.nextFloat();
        // float num2 = input.nextFloat();
        // float sum = num1 + num2;
        // System.out.println("Sum is :" + sum);

        // int  num = (int)(67.76f);
        // System.out.println(num);  // narrowing the float to integers 

        // automatic type promotion in expression 

        // int a =257;
        // byte b = (byte)(a);  //257 % 256 = 1
        // System.out.println(b);

        // byte a = 40;
        // byte b = 50;
        // byte c = 100;
        // int d= (a * b)  /c ;
        // System.out.println(d);

        int number = 'A';
        System.out.println(number); // JAVA FOLLOWS THE UNICODE PRINCIPLE 

        // Type PROMOTION RULES 

        //Rule 1 : All the byte, short  or char are promoted to integer
        //Rule 2:  If any one oof the operands is LONG or FLOAT or DOUBLE then the whole operation will be LONG or FLOAT or DOUBLE 

        // System.out.println(5 * 6.7);

        byte b =42;
        char c = 'a';
        short s =1024;
        int i = 50000;
        float f = 5.67f;
        double d = 0.2234;
        double result = (f * b)  + (i / c) +  (d * s);
        System.out.println((f * b) + " " + (i / c) + " " + (d * s));
        System.out.println(result);
        input.close();







    }
    
}
