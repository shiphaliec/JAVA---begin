import java.lang.Math;
import java.util.Arrays;
import java.util.Scanner;
public class LinearSearch {

    //------------------------search linearly over arrays----------------------------------------------//


    /*public static void main(String[] args){
            Scanner in = new Scanner(System.in); 
            int[] arr = {23 ,45 ,1 ,2, 8 , 19 , -3 , -16 , -11, 28};
            int target = -3 ;
            int ans = linearSearch(arr, target);
            System.out.println(ans);

            in.close();
    }

    //SEARCH IN THE ARRAY : RETURN THE INDEX IF THE ELEMENT FOUND
    // OTHER WISE IF ITEM NOT FOUND RETURN -1

    static int linearSearch(int[] arr , int target)
    {
        if(arr.length ==0)
        {
            return -1;
        }

        // run the loop

        for(int index =0;index<arr.length;index++)
        {
            int element = arr[index];
            // check if the element is same ass target
            if(element == target)
            {
                return index ;
            }
        }

        return -1;
        
    }*/
//---------------------SEARCHING ELEMENT IN THE RANGE ---------------------------------//

    /*public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of elements :");
        int n = in.nextInt();
        System.out.println("Enter the elements of array :");
        int[] arr = new int[n];
        for(int a=0;a<n;a++)
        {
            arr[a] = in.nextInt();
        }
        System.out.println("Enter target element :");
        int target = in.nextInt();
        System.out.println("Enter the starting and ending index");
        int startIndex = in.nextInt();
        int endIndex = in.nextInt();
        int ans = searchInRange(n, arr, startIndex, endIndex, target);
        System.out.println(" The target element's index :  "+ans);
    }

    static int searchInRange(int n ,int[] arr , int startIndex, int endIndex , int target){
        if(arr.length == 0)
        {
            return -1;
        }

        // run the loop

        for(int i = startIndex; i <= endIndex ;  i++)
        {
            int element = arr[i];
            if (element == target) {
                return i;
            }
        }

        return -1;
    }*/
 //---------------------------SEARCH SMALLEST NUMBER-----------------------------------//

    /*public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of elements :");
        int n = in.nextInt();
        System.out.println("Enter the elements of array :");
        int[] arr = new int[n];
        for(int a=0;a<n;a++)
        {
            arr[a] = in.nextInt();
        }

        int ans = min(n , arr);
        System.out.println("The smallest element : " + ans);
    }
    
    static int min(int n ,int[] arr){
        int min = arr[0];
        for(int i = 0;i<n;i++){
            if(arr[i] < min)
            {
                min = arr[i];
            }
        }
        return min;
    }*/
    
    //--------------------------------SEARCHING INDEX IN 2D ARRAYS--------------------------------//

    /*public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] arr = {
            {23, 4 , 3},
            {34 , 56,21,3},
            {52,74,98,55},
            {12,15}
        };
        int target = in.nextInt();
        int[] ans = search(arr , target);
        System.out.println(Arrays.toString(ans));
    }

    static int[] search(int[][] arr , int target){
        for(int row = 0;row < arr.length;row++)
        {
            for(int col = 0;col<arr[row].length;col++)
            {
                if(arr[row][col] == target)
                {
                    return new int[]{row , col};
                }
            }
        }
        return new int[]{-1, -1};
    }*/

    /*public static void main(String[] args) {
        // Scanner in = new Scanner(System.in);
        int[][] arr = {
            {23, 4 , 3},
            {34 , 56,21,3},
            {52,74,98,55},
            {12,15}
        };

        System.out.println("The minimum value : " + min(arr));
        
        
    }

    static int min(int[][] arr){
        int min = Integer.MAX_VALUE;
        for(int row = 0;row<arr.length; row++)
        {
            for(int col = 0; col<arr[row].length;col++)
            {
                if(arr[row][col] < min)
                {
                    min = arr[row][col];
                }
            }
        }
        return min;
    }*/

    //-----------------------FIND THE NUMBER WITH EVEN NUMBER OF DIGITS-------------------------------//
    
    /*public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of elements in an array :");
        int n = in.nextInt();
        System.out.println("Enter the elements of array");
        int[] num = new int[n];
        for(int a =0;a<n;a++)
        {
            num[a] = in.nextInt();
        }
        int ans = FindNumbers(num);
        System.out.println("The numbers with even digits : " + ans);
    }

    static int FindNumbers(int[] nums)
    {
        int count = 0;
        for (int num : nums) {
            if(even(num)){
                count++;
            }
        }
        return count;
    }

    static boolean even(int num){
       int numOfdigits = digit2(num);
       if(numOfdigits % 2 ==0)
       {
        return true;
       }
       return false;
    }
    // --------------METHOD 1 FOR FINDING THE NUMBER OF DIGITS------------//
    /*static int digits(int num){
        if(num < 0)
        {
            num *= -1;
        }
        if(num == 0)
        {
            return 1;
        }
        int count = 0;
        while (num > 0) {
            count++;
            num /= 10;
        }
        return count;
    }--------------

    // -------------------------------METHOD 2 FOR FINDING THE NUMBER OF DIGITS IN THE NUMBER------------------------//
    static int digit2(int num){
        if(num < 0)
        {
            num *= -1;
        }
        return (int)(Math.log10(num)) + 1;
    }*/

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of persons :");
        int per = in.nextInt();
        System.out.println("Enter thr number of account :");
        int acc = in.nextInt();
        int[][] arr = new int[per][acc];
        System.out.println("Enter the amount deposited by each person");
        for(int a = 0;a<per;a++)
        {
            for(int b=0;b<acc;b++)
            {
                arr[a][b] = in.nextInt();
            }
        }
        System.out.println("Max Wealth : " + maxWealth(arr));
        
    }

    static int maxWealth(int[][] arr){
        // person = row
        // account = column
        int ans = Integer.MIN_VALUE;
        for(int person = 0;person<arr.length;person++)
        {
            // when you start a new column , add it to tthe new sum 
            int sum = 0;
            for(int account = 0;account<arr[person].length;account++)
            {
                sum += arr[person][account];
            }
            // now we have sum of accounts of person 
            // check with overall ans
            if (sum > ans) {
                ans = sum;
            }
        }
        return ans;
    }

}
