import java.util.*;
class EvenorOdd
  {
    public static void even(int n)
    {
      if(n%2==0)
      {
        System.out.println("Its an Even Number");
      }
      else{
        System.out.println("Not a Even Number");
      }
    }
    public static void odd(int n)
    {
      if(n%2==1)
      {
        System.out.println("Its an Odd Number");
      }
      else{
        System.out.println("Not an Even Number");
      }
    }
    public static void main(String[]args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number you want to check");
      int n=sc.nextInt();
      even(n);
      odd(n);
    }
  }