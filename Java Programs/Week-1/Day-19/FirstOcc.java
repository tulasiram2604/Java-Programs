import java.util.*;
class FirstOcc
  {
    public static void main(String[]args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the String ");
      String st=sc.nextLine();
      System.out.println("Enter the character you want to check the 0ccarance");
      char ch=sc.next().charAt(0);
      int c=st.indexOf(ch);
      System.out.println("The 1st occarances of "+ch+"in the position of"+c);
    }
  }