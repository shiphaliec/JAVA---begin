// import java.util.Arrays;
import java.util.Scanner;
public class arrays {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        //          TWO DIMENSION ARRAY 

        // Syntax of array
        //datatype[] variable_name = new datatype[size]; 

        //store 5roll no.

        // int[] rollno = new int[5];
        //OR
        // int rollNo = {34,65,43,63,35};

        int[] ros ; //array declaration
        ros = new int [5]; // array initialization
        System.out.println(ros[2]);
        int[] arr = new int[4];
        arr[0] = 23;
        arr[1] = 45;
        arr[2] =87;
        arr[3] = 90;
        System.out.println(arr[3]);


        //input of array using for loops

        // for(int i=0;i<arr.length;i++)
        // {
        //     System.out.println(arr[i] + " ");
        // }
        

        //for each loop

        // for(int num : arr) //for every element in the array print the array
        // {
        //     System.out.println(num + " "); // here num represents element of array
        // }
        
         //toString method

        //  System.out.println(Arrays.toString(arr));

        // Arrays for complext data type or objects

        // String[] str = new String[5];
        // for(int i = 0;i<str.length;i++)
        // {
        //     str[i] = in.next();
        // }
        // System.out.println(Arrays.toString(str ));
        // in.close();
         
        //              MULTIDIMENSION ARRAYS

        // int[][] arr = new int[3][4]; // column index is not necessarily defined

        // int[][] array = {
        //     {1,2,3,4},
        //     {5,6,7,8},
        //     {10,11,12}
        // };

        // int[][] arr = new int[3][3];
        // System.out.println(arr.length);

        // //            INPUT

        // for(int row=0;row<arr.length;row++)
        // {
        //     for(int col = 0; col<arr[row].length;col++)
        //     {
        //          arr[row][col] = in.nextInt();   
        //     }
        // }
    //   
    

    //  output in enhanced way

    // for(int row = 0; row<arr.length;row++)
    // {
    //     System.out.println(Arrays.toString(arr[row]));
    // }

    in.close();
    // }
    }
}
