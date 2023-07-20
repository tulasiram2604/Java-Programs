//Without Return type With Parameters
import java.util.*;
class EleSum
  {
    public void sumArr(int a[],int n)
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
      EleSum es=new EleSum();
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