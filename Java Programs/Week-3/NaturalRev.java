import java.util.*;
class NaturalRev
  {
    public static void main(String[]args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number you want natural numbers in reverse order");
      int i=sc.nextInt();
      int n=1;
      System.out.println("The Natural Numbers From"+i+" to 1 Reverse Order");
      while(i>=n)
        {
          System.out.print(i+"\t");
          i--;
        }
    }
  }