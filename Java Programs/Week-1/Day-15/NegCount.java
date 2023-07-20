import java.util.*;
class NegCount
  {
    public static void negCou(int a[])
    {
      int count=0;
      for(int i=0;i<a.length;i++)
        {
          if(a[i]<0)
          {
            count++;
          }
        }
          System.out.println("The Negative Numbers in the array is :"+count);
    }
    public static void main(String[]args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the elements in the array");
      int arr[]=new int[6];
      for(int i=0;i<arr.length;i++)
        {
          arr[i]=sc.nextInt();
        }
      negCou(arr);
    }
  }