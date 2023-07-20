//With return type with parameters
import java.util.*;
class MinEle3
  {
    public int[] arrayEle()
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the size of the Array");
      int size=sc.nextInt();
      int a[]=new int[size];
      System.out.println("Enter The Elements in the array");
      for(int i=0;i<size;i++)
        {
          a[i]=sc.nextInt();
        }
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
      MinEle3 me=new MinEle3();
      me.arrayEle();
    }
  }