import java.util.Scanner;
public class Basics {
    public static void main(String[] args)throws Exception
    {
        Scanner in = new Scanner(System.in);
        /*int a = 10;
        if(a==10)
        {
            System.out.println("Hello world");
        }

        int count = 1;
        while(count!=5 )
        {
            System.out.println(count);
            count++;
        }

        for(int cout=1;cout!= 9;cout++){
            System.out.println(cout);
        }

        for(int num = 1;num<100; num++)
        {
            System.out.println("Heloo world");
        }*/

        String fruit = in.nextLine();
        switch(fruit)
        {
            case "Mango" : 
                  System.out.println("Kings of fruit ");
                  break;
            case " Apple" :
                  System.out.println("A sweet red fruit");
                  break;
            case " Papaya ":
                  System.out.println("Acid fruit");
                  break;
            case " Watermelon" : 
                  System.out.println("Sweet and juicy fruit");
                  break;
            default :
                   System.out.println("Please enter a valid fruit");
        }
    }
    
}
