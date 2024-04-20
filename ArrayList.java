
// import java.util.List;

import java.util.Scanner;
public class ArrayList {
    public static void main(String[] args){
        //         SYNTAX OF ARRAYLIST

        Scanner in = new Scanner(System.in);

        // java.util.ArrayList<Integer> list = new java.util.ArrayList<>(10);

        // list.add(1234);
        // list.add(124);
        // list.add(124);
        // list.add(1234);
        // list.add(12349);
        // list.add(12834);
        // list.add(234);
        // list.add(12304);
        // list.add(91234);
        // list.add(1234);
        // list.add(1234);
        // list.add(1234);
        // list.add(1234);
        // list.add(1234);
        // list.add(1234);
        // list.add(1234);

        // System.out.println(list.contains(124));
        // System.out.println(list.indexOf(3));

        // System.out.print(list + " " );


        /*for (int i = 0; i < 5; i++) {
            System.out.println(in.nextInt());
        }

        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i)); // pass index here  , list[index] syntax will not work here
        }
        System.out.println(list);*/

    //   
    java.util.ArrayList<java.util.ArrayList<Integer>> list = new java.util.ArrayList<>();

    //initialization for multideimentional array list

    for(int i= 0 ;i<3;i++)
    {
        list.add(new java.util.ArrayList<>());
    }

    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            list.get(i).add(in.nextInt());
        }        
    }
    System.out.println(list);

    in.close();
 }




        
    
}
