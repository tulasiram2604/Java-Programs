import java.util.*;
class PosNeg
  {
    public static void main(String[]args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter Size of array");
     int n=sc.nextInt();
      int a[]=new int[n];
       System.out.println("Enter the Elements in array");
      for(int i=0;i<n;i++)
        {
          a[i]=sc.nextInt();
        }
      for(int i=0;i<n;i++)
        {
          if(i<0)
          {
            System.out.print(a[i]+" ");
          }
        }
      for(int i=0;i<n;i++)
        {
          if(i>0)
          {
             System.out.print(a[i]+" ");
          }
        }
    }
  }