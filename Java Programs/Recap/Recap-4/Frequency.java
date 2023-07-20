import java.util.*;
class Frequency
  {
    public static void main(String[]args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the size of the Array");
      int s=sc.nextInt();
      int a[]=new int[s];
      System.out.println("Enter the Elements in the array");
      for(int i=0;i<s;i++)
        {
          a[i]=sc.nextInt();
        }
      boolean b[]=new boolean[s];
      {
        for(int m=0;m<s;m++)
          {
            b[m]=false;
          }
      }
      System.out.println("Frequency of the Elements in the array is");
      for(int i=0;i<s;i++)
        {
          int count=1;
          if(b[i]==true)
            continue;
          for(int j=i+1;j<s;j++)
            {
              if(a[i]==a[j])
              {
                count++;
                b[j]=true;
              }
            }
          System.out.println("The "+a[i]+" Element Frequency is : "+count);
        }
    }
  }