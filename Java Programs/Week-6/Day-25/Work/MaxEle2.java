//With Return type With Parameters
import java.util.*;
class MaxEle2
  {
    public int[] maxEle(int a[],int n)
    {
      int max=a[0];
        for(int i=0;i<a.length;i++)
        {
          if(max<a[i])
          {
            max=a[i];
          }
        }
      System.out.println("The Maximum Element In the array is : "+max);
      return a;
    }
    public static void main(String[]args)
    {
      MaxEle2 me=new MaxEle2();
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the Size of the Array");
      int size=sc.nextInt();
      int a[]=new int[size];
      System.out.println("Enter the Elements in the Array");
      for(int i=0;i<size;i++)
        {
          a[i]=sc.nextInt();
        }
      me.maxEle(a,size);
    }
  }