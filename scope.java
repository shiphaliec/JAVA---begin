public class scope {
    public static void main(String[] args)throws Exception{
          String name = "Kunal";
          changeName(name);
          System.out.println(name);


         // int a =10; // initializing
       //   int b = 34;
          {
           // a = 96;// updating  //already initialized value outside the block, can not be  initialized again but can be modified
        //    int c = 453;
          }
        //   System.out.println(c); //values initialized in this block will remain in the block
    
    }
    static void changeName(String naam){
        naam = "Rahul"; 
    }

    static void swap(int num1 , int num2)
    {
        int temp = num1;
        num1 =num2;
        num2 = temp;  
        //this change can only be done in function scope
    }
{

    //scoping in for loop

    for(int i = 0;i<4;i++)
    {
        System.out.println(i);//scope of i is within the bracket
    }
    // System.out.println(i);
}
}

    