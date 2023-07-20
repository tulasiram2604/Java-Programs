import java.util.*;
class ArrayMet
  {
    public static void negativeNum(int a[])
    {
      System.out.println("Negative elements in the Array is");
      for(int i=0;i<a.length;i++)
        {
          if(a[i]<0)
          {
            System.out.println(a[i]+"");
          }
        }
    }
    public static void main(String[]args)
    {
      int arr[]=new int[6];
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the elements in the array");
      for(int i=0;i<arr.length;i++)
        {
         arr[i]=sc.nextInt();
        }
      negativeNum(arr);
    }
  }