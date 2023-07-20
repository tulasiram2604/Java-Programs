import java.util.*;
class Ascii
  {
    public static void main(String[]args)
    {
      Scanner s=new Scanner(System.in);
      System.out.println("Enter a Character");
      char ch=s.next().charAt(0);
      int asci=ch;
      System.out.println("Ascii value of"+ch+"is : "+asci);
    }
  }