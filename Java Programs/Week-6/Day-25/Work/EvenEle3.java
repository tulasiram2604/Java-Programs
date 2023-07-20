//With return type with parameters
import java.util.*;
class EvenEle3
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
      System.out.println("Even Elements in array are : ");
      for(int i=0;i<size;i++)
        {
          if(a[i]%2==0)
          {
            System.out.println(a[i]);
          }
        }
      return a;
    }
    public static void main(String[]args)
    {
      EvenEle3 e=new EvenEle3();
      e.arrayEle();
    }
  }