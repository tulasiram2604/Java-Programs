//With return type with parameters
import java.util.*;
class ArrayEle3
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
      System.out.println("Elements in array are :");
       for(int i=0;i<size;i++)
         {
           System.out.println(a[i]);
         }
      return a;
    }
    public static void main(String[]args)
    {
      ArrayEle3 ae=new ArrayEle3();
      ae.arrayEle();
    }
  }