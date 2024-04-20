// import java.util.Arrays;
// import java.util.Scanner;

// import javax.print.DocFlavor.INPUT_STREAM;
public class Arrays1 {
    public static void main(String[] args) {
        /* Arrays contain similar type of elements.
        The maximum size of an array is 10^6 but if it is defined globally the it will extend to 10^7*/

        //   Scanner in = new Scanner(System.in);
         
        
        //-----------------------------------------LARGEST NUMBER IN AN ARRAY--------------------------------------------//
    //    large(int[] arr, int n);
    /*int[] arr = new int[5];
    int n = 5;
         int ans = large(arr,  n);
         System.out.println(ans);

    }

    static int large(int[] arr , int n){
        arr = new int[5];
        arr[0] = 45;
        arr[1] = 4;
        arr[2] = 34;
        arr[3] = 65;
        arr[4] = 90;
        n =5;
        System.out.println(Arrays.toString(arr));
        int large = arr[0];
        for(int i = 0; i<n ; i++)
        {
            if(arr[i] > large){
                large = arr[i];
            }
        }
        return large;
    }*/

     // -------------------------------------------------OR ------------------------------------------------
    
     /*Scanner in =new Scanner(System.in);
     System.out.println("Enter the length of arrays :");
     int n = in.nextInt();
        System.out.println("Enter the elements of array");
        int[] arr = new int[n];
        for(int a = 0;a<n;a++)
        {
            if(in.hasNextInt()){
            arr[a] = in.nextInt();
             }
             else{
            System.out.println("invalid input");
            // return;
        }
        }
        System.out.println("The array : ");
       for(int a = 0;a<n;a++)
       {
           System.out.println(arr[a] + " ");
       }

       int large = arr[0];
       for(int i = 0 ;i<n ;i++)
       {
        if(arr[i] > large)
        {
            large = arr[i];
        }
       }
    //    return large;
    System.out.println(" The largest element : " + large);*/

          //---------------------------------LARGEST AND SECOND LARGEST NUMBER IN AN ARRAY----------------------------------//

        /*System.out.println("Enter the number of elements in an array :");
        int n = in.nextInt();
        System.out.println("Enter the elements of array :");
        int[] arr = new int[n];
        for(int a = 0; a <n;a++)
        {
             arr[a] = in.nextInt();
        }
        int large = arr[0];
        int Slarge = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] > large) {
                Slarge = large;
                large = arr[i];
                
            }
            else if(arr[i] == large)
            {
                for(i= i+1;i<n;i++){
                    Slarge = large;
                    large = arr[i];
                    break;
                }
            }
            else if(arr[i] < large && arr[i] > Slarge)
            {
                Slarge = arr[i];
            }
        }
        System.out.println("large and Slarge : " + large +" " + Slarge ) ;     */        

        //-------------------------------------------------SMALLEST AND SECOND SMALLEST----------------------------------------//
        //ASSUMING THAT THERE WILL BE NO NEGATIVE INTEGER

        /*System.out.println("Enter the number of elements in an array");
        int n = in.nextInt();
        System.out.println("Entr the elements of an array:");
        int[] arr = new int[n];
        for(int a = 0; a<n ;a++)
        {
            arr[a] = in.nextInt();
        }
        // Arrays.sort(arr);
        int small = arr[0];
        int Ssmall = -1 ;
        for(int i=1;i<n; i++)
        {
            if(arr[i] < small){
                Ssmall = small;
                small = arr[i];
            }
            else if(arr[i] != small && arr[i] > Ssmall)
            {
                Ssmall = arr[i];
            }
        }

        System.out.println("The Smallest and Second Smallest element are :" + small + " " + Ssmall);*/

        //--------------------------------CHECKING THE SORTED ARRAY-----------------------------------------------//

        /*System.out.println("Enter the number of elements in an array");
          int n = in.nextInt();
         System.out.println("Entr the elements of an array:");
         int[] arr = new int[n];
         for(int a = 0; a<n ;a++)
         {
             arr[a] = in.nextInt();
         }
        
        for(int i=1 ;i<n;i++)
        {
            if(arr[i] >= arr[i-1])
            {
                
            }
            else{
                System.out.println("false");
                break;
            }
            System.out.println("true");
            break;
        }
        
      
       */
        
        




    }
}
