//Without return type without parameters
import java.util.*;
class ArrayEle2
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
      System.out.println("Elements in the array are ");
      for(int i=0;i<size;i++)
        {
          System.out.println(a[i]);
        }
    }
    public static void main(String[]args)
    {
    ArrayEle2 ae=new ArrayEle2();
      ae.arrayEle();
    }
  }