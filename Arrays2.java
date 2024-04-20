// import java.util.Arrays;
// import java.util.Scanner;
// import java.io.PushbackInputStream;
public class Arrays2 {

  //-------------------------------------------------ROTATION OF ARRAY ELEMENTS BY ONE PLACE-------------------------------------------//
    /*public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of array :");
        int n = in.nextInt();
        System.out.println("Enter the elements of array :");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(" The resultant array is : " );
        // System.out.println(rotationleft(arr, n) );
        // int[] rotatedarr = rotationleft(arr, n);
        // Arrays.stream(rotatedarr);
        System.out.println(Arrays.toString(rotationleft(arr, n)));

    }

    static int[] rotationleft(int[] arr , int n){ // Time complexity = O(n) and Space Complexity (extra space )= O(1)
        int temp = arr[0];
        int[] rotatedarr = new int[n];
        for(int j = 1 ; j < n ; j++)
        {
            rotatedarr[j-1] = arr[j];
        }
        rotatedarr[n-1] =temp;
        // return arr;
        //  rotatedarr = Arrays.copyOf(arr, arr.length);
        return rotatedarr;

    }*/


    /*public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = in.nextInt();
        System.out.println("Enter the element of array :");
        int[] arr = new int[n];
        for(int i = 0;i<n;i++)
        {
            arr[i] = in.nextInt();
        }
        System.out.println("Enter the number to which the rotation be performed");
        int d = in.nextInt();
        
        System.out.println(rotationByd(arr, d));


    }

    static int[] rotationByd(int arr[] , int d){
        d = d % arr.length;
        int[] temp = new int[d] ;
        
        int j ;
        for( j = 0;j<d;j++)
        {
            temp[j] = arr[j];
        }
        for(j = d;j<arr.length;j++)
        {
            arr[j-d] = arr[j];
        }

        for(j = arr.length-d;j<arr.length;j++)
        {
            arr[j] = temp[j - (arr.length -d)];
        }

        // for( j =arr.length-d;j<d;j++)
        // {
        //     arr[arr.length - d +j] = temp[j];
        // }
        return arr;
    }*/

    /*public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of element in an array :");
        int n = in.nextInt();
        System.out.println("Enter the elements of an array :");
        int[] arr = new int[n];
        for(int a = 0;a<n;a++)
        {
            arr[a] = in.nextInt();
        }
        System.out.println("The resultant array :");
        int[] result = movezero(arr, n);
        for(int num : result)
        {
            System.out.println(num + " ");
        }

    }*/

    // static int[] movezero(int[] arr, int n){
        // int[] temp;
        // int count = 0;
        // for(int i= 0;i<n;i++)
        // {
        //     if(arr[i] != 0)
        //     {
        //         // temp = arr[i] ;
        //         count++;
                
        //     }
        // }
        // int[] temp = new int[count];
        // int index= 0;
        
        // for(int i =0;i <count ;i++)
        // {
        //     if(arr[i] != 0)
        //     {
        //         temp[index++] = arr[i];
        //     }
        // }
        // for(int i = count ;i<n;i++)
        // {
        //     temp[index++] = 0;
        // }

        // return temp;

        /*for(int i =0 ;i<n;i++)
        {
            if(arr[i] != 0)
            {
                int[] temp[i] = arr[i] ;
            }
        }
        for(int i = 0 ; i< temp.size();i++)
        {
            arr[i] = temp[i];
        }
        for(int i = temp.size();i<n;i++)
        {
            arr[i] = 0;
        }

        return arr;*/
    }
// }
