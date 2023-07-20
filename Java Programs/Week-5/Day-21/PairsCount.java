import java.util.*;
class PairsCount
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the size of an array");
      int n=sc.nextInt();
      int a[]=new int[n];
      System.out.println("Enter the Elements in array");
      for(int i=0;i<n;i++)
        {
           a[i]=sc.nextInt();
        }
      System.out.println("enter the divisor");
      int k=sc.nextInt();
      int count=0;
      for(int i=0;i<n;i++)
        {
          for(int j=i+1;j<n;j++)
            {
              if(((a[i]+a[j])%k==0)&&(i<j))
              {
                count++;
              }
            }
        }
      System.out.println("the number of pairs are"+count);
    }
  }