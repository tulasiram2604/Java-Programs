import java.util.*;
class Unique
  {
    public static void main(String[]args)
    {
      Scanner s=new Scanner(System.in);
      System.out.println("Enter the size of the array");
      int n=s.nextInt();
      int a[]=new int[n];
      System.out.println("Enter the elements in the array");
      for(int i=0;i<n;i++)
        {
          a[i]=s.nextInt();
        }
      boolean b[]=new boolean[n];
      {
        for(int m=0;m<n;m++)
          {
            b[m]=false;
          }
      }
      System.out.println("Frequency of the Elements in the array is");
      for(int i=0;i<n;i++)
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
            if(count==1)
            {
              System.out.println("Unique elements in the array is "+a[i]);
          }  
    }
  }
}