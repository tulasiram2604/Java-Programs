import java.util.*;
class ReverseArray
  {
    public static void reversArr(int a[],int n)
    {
      System.out.println("Printing the Elements in Reverse Order");
      for(int i=(n-1);i>=0;i--)
        {
          System.out.println(a[i]+"");
        }
    }
    public static void main(String[]args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter The Size of The array");
      int n=sc.nextInt();
      int a[]=new int[n];
      System.out.println("Enter the Elements in the Array ");
      for(int i=0;i<n;i++)
      {
        a[i]=sc.nextInt();
      }
      reversArr(a, n);
    }
  }