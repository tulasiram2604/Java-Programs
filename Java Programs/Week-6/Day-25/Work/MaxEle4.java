//With return type with parameters
import java.util.*;
class MaxEle4
  {
    public int[] arrayEle(int a[],int size)
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
      MaxEle4 ae=new MaxEle4();
       Scanner sc=new Scanner(System.in);
      System.out.println("Enter the size of the Array");
      int size=sc.nextInt();
      int a[]=new int[size];
      System.out.println("Enter The Elements in the array");
      for(int i=0;i<size;i++)
        {
          a[i]=sc.nextInt();
        }
      ae.arrayEle(a,size);
    }
  }