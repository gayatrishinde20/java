import java.util.Scanner;

public class Palinconverter{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the word or phrase:");
        String str = sc.next();
        String o_str=str;
        String rev="";
        int len = str.length();

        for (int i=len-1;i>=0;i--)
        {
           
            rev=rev+str.charAt(i);
        }
        if(o_str.equals(rev))
            {
        System.out.println( " is palindrome string " + o_str);
            }
            else
            {
                System.out.println (" is not  palindrome string " + o_str);
            }

    }
}