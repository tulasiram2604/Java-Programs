import java.util.*;
class Divisible
  {
    public static void main(String [] args)
    {
      Scanner s=new Scanner(System.in);
      System.out.println("Enter any number 1 value");
      int num1=s.nextInt();
      System.out.println("Enter any number 2 value");
      int num2=s.nextInt();
      if(num1%num2==0)
      {
        System.out.println("Number 1 is divisible by number 2");
      }
      System.out.println("Number 1 is not divisible by number 2");
    }
  }