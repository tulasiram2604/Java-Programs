import java.util.*;
class ArrEven
  {
    public static void main(String[]args)
    {
      Scanner s=new Scanner(System.in);
      System.out.println("Enter the Size of the Array");
      int n=s.nextInt();
      int a[]=new int[n];
      System.out.println("Enter The elements in the array");
      for(int i=0;i<n;i++)
        {
          a[i]=s.nextInt();
        }
      System.out.println("The Even Elements In array is");
      for(int i=0;i<n;i++)
        {
          if(a[i]%2==0)
          {
            System.out.println(a[i]);
          }
        }
    }
  }