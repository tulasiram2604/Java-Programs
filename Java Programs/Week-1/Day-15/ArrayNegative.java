import java.util.*;
class ArrayNegative
  {
    public static void main(String[]args)
    {
      int a[]=new int[10];
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the Elements in the array");
      for(int i=0;i<a.length;i++)
        {
          a[i]=sc.nextInt();
        }
      System.out.println("The negative elements in the array are");
      for(int i=0;i<a.length;i++)
          {
        if(a[i]<0)
        {
          System.out.println(a[i]+"");
        }
        }
    }
  }