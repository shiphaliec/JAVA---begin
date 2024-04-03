// import java.lang.*;
import java.util.Scanner;
// import java.util.Scanner;
public class first {
    public static void main(String[] args)throws Exception
    {
        // int a=19;
        // System.out.println(a);
        // System.out.println("Hello World");
        // Scanner input = new Scanner(System.in); // Systeem.in means standard input from keyboard
        // System.out.println(input .nextInt());
        // input.close(); //in vs code it is showing a warning that Scanner is not closed 
        // close what you have instantiated so it totally upto you

        
        // PRIMITIVES 

        // int rollno =64;
        // String name = "kunal" ; //String is not a primitive data type cause it can be breaked into others
        // Float marks= 98.8f;
        // double largedecimalnumbers = 4545235.8;
        // boolean check = false;

        //  INPUTS 

        Scanner input = new Scanner(System.in);
        // System.out.println("Enter your roll no :");
        // int roll = input.nextInt();
        // System.out.println("Your roll no is :" + roll);

        // LITERALS ARE THE SYNTATICAL REPRESENTATION OF DATA TYPE LIKE BOOLEAN , INT .
        // THE REFERENCE VARIABL IS CALLED AN IDENTIFIER 

        //int a = 10 ; // a -> identifier 

        int b = 234_000_000;
        System.out.println(b);

        String name = input.next();
        System.out.println(name);
        input.close();

        

    }
    
}

