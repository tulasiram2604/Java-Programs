import java.util.*;
class CountEvenOdd
  {
    public static void countEven(int a[])
    {
      int count=0;
      for(int i=0;i<a.length;i++)
        {
          if(a[i]%2==0)
          {
            System.out.println(a[i]+"");
            count++;
          }
        }
       System.out.println("The Number Of even Numbers in Array is "+count);
    }
    public static void countOdd(int a[])
    {
      int count=0;
      for(int i=0;i<a.length;i++)
        {
          if(a[i]%2==1)
          {
            System.out.println(a[i]+"");
            count++;
          }
        }
          System.out.println("The Number Of odd Numbers in Array is "+count);
  }
      public static void main(String[]args)
        {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[6];
        System.out.println("Enter the elements in the array");
        for(int i=0;i<arr.length;i++)
          {
            arr[i]=sc.nextInt();
          }
        countEven(arr);
        countOdd(arr);      
        }
    }