import java.util.*;
class SampleIf
  {
    public static void main(String [] args)
    {
      Scanner s=new Scanner(System.in);
      System.out.println("Enter any number");
      int num=s.nextInt();
      if(num%2==0)
      {
        System.out.println("You have enter a multiple of 2");
      }
      System.out.println("You entered is not a multiple of 2");
    }
  }