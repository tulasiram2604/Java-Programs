//With return type with parameters
import java.util.*;
class MaxEle3
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
      MaxEle3 ae=new MaxEle3();
      ae.arrayEle();
    }
  }