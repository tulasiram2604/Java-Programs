//With Return type With Parameters
import java.util.*;
class MinEle2
  {
    public int[] minEle(int a[],int n)
    {
      int min=a[0];
        for(int i=0;i<a.length;i++)
        {
          if(min>a[i])
          {
            min=a[i];
          }
        }
      System.out.println("The Minimum Element In the array is : "+min);
      return a;
    }
    public static void main(String[]args)
    {
      MinEle2 me=new MinEle2();
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the Size of the Array");
      int size=sc.nextInt();
      int a[]=new int[size];
      System.out.println("Enter the Elements in the Array");
      for(int i=0;i<size;i++)
        {
          a[i]=sc.nextInt();
        }
      me.minEle(a,size);
    }
  }