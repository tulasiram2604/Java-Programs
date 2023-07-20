//Without return type with parameters
import java.util.*;
class ArrayEle
  {
    public void arrayEle(int a[],int size)
    {
     System.out.println("Elements in array are :");
       for(int i=0;i<size;i++)
         {
           System.out.println(a[i]);
         }
    }
    public static void main(String[]args)
    {
      ArrayEle ae=new ArrayEle();
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