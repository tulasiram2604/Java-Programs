import java.util.*;
public class PalindromeString
{
    public static void main(String[] args)
 {
Scanner s=new Scanner(System.in);
   System.out.println("Enter A Word");
        String str=s.nextLine();
        String rev="";
        for(int i=str.length()-1;i>=0;i--)
        {
                  rev=rev+str.charAt(i);
        }
        System.out.println(rev);
        if(str.equals(rev))
        {
            System.out.println("given string is palindrome");
        }
        else
{
        System.out.println("not a palindrome");
}
    }
}