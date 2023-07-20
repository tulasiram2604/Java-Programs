import java.util.*;
class MaxEle
  {
    public static void eleMax(int a[],int n)
    {
      int max=a[0];
      for(int i=0;i<n;i++)
        {
          if(max<a[i])
          {
            max=a[i];
          }
        }
      System.out.println("The Max Element in the array : "+max);
    }
    public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the Size of the Array");
      int n=sc.nextInt();
      int a[]=new int[n];
      System.out.println("Enter the"+n+" Elements in the Array");
      for(int i=0;i<n;i++)
        {
          a[i]=sc.nextInt();
        }
      eleMax(a,n);
    }
  }