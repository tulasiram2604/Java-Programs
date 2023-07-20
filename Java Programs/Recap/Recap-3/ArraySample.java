import java.util.*;
class ArraySample
  {
    public static void main(String[]args)
    {
      Scanner s=new Scanner(System.in);
      int a[]=new int[5];
      System.out.println("Enter The Size of the Array");
      for(int i=0;i<a.length;i++)
        {
          a[i]=s.nextInt();
        }
      System.out.println("The Array Elements are");
      for(int i=0;i<a.length;i++)
        {
          System.out.println(a[i]);
        }
    }
  }