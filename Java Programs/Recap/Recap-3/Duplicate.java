import java.util.*;
class Duplicate
  {
    public static void main(String[] args)
    {
      Scanner s=new Scanner(System.in);
      System.out.println("Enter The size of the Array");
      int n=s.nextInt();
      int a[]=new int[n];
      System.out.println("Enter the"+n+" Elements in the Array");
      for(int i=0;i<n;i++)
        {
          a[i]=s.nextInt();
        }
      System.out.println("Duplicate Values in the array is");
      for(int i=0;i<n;i++)
        {
          for(int j=i+1;j<n;j++)
            {
              if(a[i]==a[j])
                 {
                System.out.println(a[i]);
                 }
            }
        }
    }
  }