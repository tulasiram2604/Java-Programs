import java.util.*;
class StrReplace
  {
    public static void main(String[]args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter a String");
      String st=sc.nextLine();
      System.out.println("Enter the String Value you wnat to replace");
      String str=sc.nextLine();
      System.out.println(st.replace(str));
    }
  }