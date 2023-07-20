//Without return type without parameters
import java.util.*;
class OddEle2
  {
    public void arrayEle()
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
    }
    public static void main(String[]args)
    {
      OddEle2 oe=new OddEle2();
      oe.arrayEle();
    }
  }