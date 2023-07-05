import java.util.*;
class SumNatural
  {
    public static void main(String[]args)
    {
      Scanner s=new Scanner(System.in);
      System.out.println("Enter the Number you want upto the sum of natural numbers");
      int n=s.nextInt();
      int sum=0;
       System.out.println("The Numbers are");
      for(int i=1;i<=n;i++)
        {
          System.out.println(i);
          sum=sum+i;
        }
      System.out.println("Sum of" +n+ " numbers : "+sum);
    }
  }