//With Return type With Parameters
import java.util.*;
class EleSum2
  {
    public int[] sumArr(int a[],int n)
    {
      int sum=0;
      for(int i=0;i<n;i++)
        {
          sum=sum+a[i];
        }
      System.out.println("The Sum of All the Elements in The Array is "+sum);
      return a;
    }
    public static void main(String[]args)
    {
      EleSum2 es=new EleSum2();
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the Size of the Array");
      int size=sc.nextInt();
      int a[]=new int[size];
      System.out.println("Enter the Elements in the Array");
      for(int i=0;i<size;i++)
        {
          a[i]=sc.nextInt();
        }
      es.sumArr(a,size);
    }
  }