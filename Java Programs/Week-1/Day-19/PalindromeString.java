import java.util.*;
class PalindromeString
  {
    public static void main(String []args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter The String");
      String st=sc.next();
      String rev="";
      for(int i=st.length()-1;i>=0;i--)
        {
          rev=rev+st.charAt(i);
        }
      System.out.println(rev);
      if(st.equals(rev))
      {
        System.out.println("Its a Palindrome String");
      }
      else
      {
        System.out.println("Not a Palindrome String");
      }
    }
  }