import java.util.Scanner;
public class Temperature {

    public static void main(String[] args)throws Exception{
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Temperature in Celsius :");
        float C = input.nextFloat();
        float F = (C * 9/5 ) + 32 ;
        System.out.println("The Temperature in Fahrenheit :" + F);
        input.close();


    }
    
}
