import java.util.*;
class MaxEle
  {
    public static void main(String[]args)
    {
      Scanner s=new Scanner(System.in);
      int a[]=new int[5];
      System.out.println("Enter the elements in the array");
      for(int i=0;i<a.length;i++)
        {
          a[i]=s.nextInt();
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
    }
  }