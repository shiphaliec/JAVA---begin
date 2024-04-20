import java.util.Scanner;
public class SearchToStrings {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        char  target = in.next().charAt(0);
        System.out.println(searchtostring(name,target));
        in.close();
    }

    static boolean searchtostring(String str , char target ){
        if(str.length() == 0 )
        {
            return false;
        }

        for(int  i =0;i<str.length();i++)
        {
            if (target == str.charAt(i)) {
                return true;
            }
        }
        return false;

    }
}
