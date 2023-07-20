import java.util.*;
class ArrayPrime
  {
    public static void primeNum(int a[],int n)
    {
      System.out.println("The prime Numbers in the array is");
      for(int i=0;i<n;i++)
        {
          int count=0;
          for(int j=1;j<=a[i];j++)
            {
              if(a[i]%j==0)
              {
                count++;
              }
            }
              if(count==2)
              {
                System.out.println(a[i]+"");
              }
        }
    }
    public static void main(String[]args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the Size of the Array");
      int n=sc.nextInt();
      int a[]=new int[n];
      System.out.println("Enter The Elements in the Array");
      for(int i=0;i<n;i++)
        {
          a[i]=sc.nextInt();
        }
      primeNum(a,n);
    }
  }