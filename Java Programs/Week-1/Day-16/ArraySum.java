import java.util.*;
class ArraySum
  {
    public static void sumArr(int a[],int n)
    {
      int sum=0;
      for(int i=0;i<n;i++)
        {
          sum=sum+a[i];
        }
      System.out.println("The Sum of All the Elements in The Array is "+sum);
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
      sumArr(a,n);
    }
  }