//With return type with parameters
import java.util.*;
class OddEle3
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
      System.out.println("Odd Elements in array are : ");
      for(int i=0;i<size;i++)
        {
          if(a[i]%2==1)
          {
            System.out.println(a[i]);
          }
        }
      return a;
    }
    public static void main(String[]args)
    {
      OddEle3 oe=new OddEle3();
      oe.arrayEle();
    }
  }