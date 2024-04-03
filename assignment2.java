//import java.lang.*;
import java.util.Scanner;
//import java.lang.Math.*;
public class assignment2 {
    public static void main(String[] args)throws Exception
    {
        Scanner in = new Scanner(System.in);

        // AREA OF CIRCLE
/* 
        System.out.println("Enter the radius of the circle :");
        double r = in.nextDouble();
        double area = r * r * Math.PI;
        System.out.println("The area of circle : " + area);
*/
        // AREA OF A ISOSCELES TRIANGLE
        /*
        System.out.println("Enter the height and breadth of the triangle : ");
        int h = in.nextInt();
        int b = in.nextInt();
        float area = (h * b) / 2;
        System.out.println("Areea of the triangle :" + area);
 
        */

        // AREA OF A RECTANGLE 
        /* 
        int l = in.nextInt();
        int b = in.nextInt();
        int area = l* b;
        System.out.println("the area of the rectangle :" + area);
        */

        //Area of a triangle 
        /* 

        System.out.println("Enter the sides of the triangle :");
        int a= in.nextInt();
        int b= in.nextInt();
        int c = in.nextInt();
        double s = (a + b + c)/2;
        double area = (double) Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("The are of a triangle is :" + area);
        */

        //AREA OF A PARELLELOGRAM 
/* 
        int base = in.nextInt();
        int height = in.nextInt();
        int area = base * height;
        System.out.println("Area :" + area);
        */

        //AREA OF A RHOMBUS
        /* 
        int dia1 = in.nextInt();
        int dia2 = in.nextInt();
        float area = (dia1 * dia2) /2;
        System.out.println("Area : " + area);
    */
        //Area of equilateral triangle 
        /* 
        System.out.println("Enter the side of the triangle :");
        int a =in.nextInt();
        float area = a * a* (float)(Math.sqrt(3)/4);
        System.out.println(area);     */

        // PERIMETER OF THE CIRCLE 
 /* 
        int r= in.nextInt();
        double p = 2 * Math.PI * r;
        System.out.println(p);

        */

        //PERIMETER OF EQUILATERAL TRIANGLE 
         /* 
        int a = in.nextInt();
        float p =3 * a;
        System.out.println("Perimeter : "+ p);
        */

        // PERIMETER OF PARALLELOGRAM  

        /*  int  a = in.nextInt();
        int b = in.nextInt();
        int p = 2 * (a + b);
        System.out.println(p); */

        //PERIMETER OF RECTANGLE 

       /*  int L = in.nextInt();
        int W = in.nextInt();
        int P = 2 * (L + B);
        System.out.println(P); */

        // PERIMETER OF SQUARE AND RHOMBUS AS WELL

       /*  int a = in.nextInt();
        int P = 4 * a;
        System.out.println(P);  */
        

        // VOLUME OF CONE 

        /*  float h = in.nextInt();
        float r = in.nextInt();
        double volume = (1.0) / 3 * h * (float) Math.PI * r * r;
        System.out.println("Volume of Cone : " + volume);    */

        // VOLUME OF PRISM 

        /* int b = in.nextInt();
        int h = in.nextInt();
        int V = b * h;
        System.out.println("Volume of Prism :" + V); */

        // VOLUME OF CYLINDER 
        /*float r = in.nextFloat();
        float h = in.nextFloat();
        float V = (float) Math.PI * r * r *h ;
        System.out.println("The volume of cylinder : " + V);*/

        // Volume of sphere 
        /*float r = in.nextFloat();
        float volume = 4 / 3 * (float) Math.PI *r *r *r;
        System.out.println("The volume of sphere :" + volume);*/

        // VOLUME OF PYRAMID 
        
        /*int l = in.nextInt();
        int w = in.nextInt();
        int h = in.nextInt();
        float V = (l * w  * h) / 3;
        System.out.println("The volume of pyramid :" + V);*/

        // CURVED SURFACE AREA OF CYLINDER 

        /*float r = in.nextFloat();
        int h = in.nextInt();
        float CSA = 2 * (float) Math.PI * r * h;
        System.out.println("The curved surface area of cylinder : " + CSA);*/

        // TOTAL SURFACE AREA OF CUBE 

        /*int s = in.nextInt();
        int SA = 6 * s *s;
        System.out.println("Total surface area of cube is : " + SA);*/

        // Fibonacci series 

        /*int n = in.nextInt();
        int a = 0, b = 1 ,c;
        System.out.println(a + ", " + b + " ,");
        for(int i = 0; i < n-2 ; i++)
        {
            c = a +b ;
            System.out.println(c + " ,");
            a = b;
            b = c;
        }*/

        // Diffrence of product of digits to sum of digits 

        /*int n = in.nextInt();
        int product = 1;
        int sum = 0;
        while(n!=0)
        {
            int lastdigit = n % 10;
            product = product * lastdigit;
            sum = sum + lastdigit;
            n = n / 10 ;
        }
        int ans = product - sum ;
        System.out.println("The difference is : " + ans);*/


        // FACTOR OF A NUMBER
        /*System.out.println(" THe factors of number to be calculated :"); 
        int n = in.nextInt();
        for ( int i = 1 ; i<=n ; i++)
        {
            if(n % i == 0)
            {
                System.out.println( i + " ,");
            }
            else{
                continue;
            }
        }*/

        // TAKE INTEGER FROM USER TILL 0 IS PRESSED AND PRINT THE SUM OF ALL INTEGERS
        //Wrong code ...............
        /*int num = 0 , sum =0;
        while (true) {
            if(num == 0)
            {
                break;
            }
            else{
                num = in.nextInt();
                sum += num;
                System.out.println(sum);
                num++;
            }   
        }*/ //wrong code..........
        
          // correct solution .........
        /*int num = 0 , sum = 0;
        while(true)
        {
            num = in.nextInt();
            if(num==0)
            {
                break;
            }
            sum +=num;
        }
        System.out.println(sum);*/ 
        
        // Takes integer input till user enter 0 and find largest among them;
        
        /*int num = 0 ,sum = 0;
        int max =0;
        while(true)
        {
            num = in.nextInt();
            if(num == 0)
            {
                break;
            }
            max = Math.max(num ,sum); 
            sum = num;
        }
        System.out.println("max number :" + max);*/

        // ADDITION OF TWO NUMBER

        /*int a = in.nextInt();
        int b = in.nextInt();
        int add = a + b; 
        System.out.println(add); */

        in.close();
        








        








    }
    
}
