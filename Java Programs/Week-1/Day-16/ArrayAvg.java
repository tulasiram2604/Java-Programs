import java.util.*;
class ArrayAvg
  {
    public static void avgArr(int a[],int n)
    {
      int sum=0,avg;
      for(int i=0;i<n;i++)
        {
          sum=sum+a[i];
        }
      avg=sum/n;
      System.out.println("The Average of All Elements In the Array is "+avg);
    }
    public static void main(String[]args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the Size of the Array");
      int n=sc.nextInt();
      int a[]=new int[n];
      System.out.println("Enter the Elements in the Array");
      for(int i=0;i<n;i++)
        {
          a[i]=sc.nextInt();
        }
      avgArr(a, n);
    }
  }