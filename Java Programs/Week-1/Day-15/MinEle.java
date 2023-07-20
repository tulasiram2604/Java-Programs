import java.util.*;
class MinEle
  {
    public static void eleMin(int a[],int n)
    {
      int min=a[0];
      for(int i=0;i<n;i++)
        {
          if(min>a[i])
          {
            min=a[i];
          }
        }
      System.out.println("The minimum element in the array is"+min);
    }
    public static void main(String[]args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the Size of the Array");
      int n=sc.nextInt();
      int a[]=new int[n];
      System.out.println("Enter the Array Elements");
      for(int i=0;i<n;i++)
        {
          a[i]=sc.nextInt();
        }
      eleMin(a,n);
    }
  }