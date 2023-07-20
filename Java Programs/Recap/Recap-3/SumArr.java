import java.util.*;
class SumArr
  {
    public static void main(String[]args)
    {
      Scanner s=new Scanner(System.in);
      int sum=0;
      int a[]=new int[5];
      System.out.println("Enter the Elements in the array");
      for(int i=0;i<a.length;i++)
        {
          a[i]=s.nextInt();
        }
      for(int i=0;i<a.length;i++)
        {
          sum=sum+a[i];
        }
      System.out.println("The Sum of the Array elements is : "+sum);
    }
  }