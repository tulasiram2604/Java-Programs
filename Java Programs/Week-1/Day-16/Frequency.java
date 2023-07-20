import java.util.*;
class Frequency
  {
  public static void main(String[] args)
    {
    Scanner sc=new Scanner(System.in);
      System.out.println("Enter the Size of the array")
    int n=sc.nextInt();
    inr a[]=new int[n];
      boolean b[]=new boolean[size];
      for(int k=0;k<size;k++)
        {
          b[k]=false;
        }
    System.out.println("Element -----------Frequency");
      for(int i=0;i<a.length;i++)
        {
          int count=1;
          if(b[i]==true)
            continue;
          for(int j=i+1;j<a.length;j++)
            {
              if(a[i]==a[j])
              {
                count++;
                b[j]=true;
              }
            }
         
          System.out.println(a[i]+"------------"+count);
        }
    }
  }
    
    }
  }