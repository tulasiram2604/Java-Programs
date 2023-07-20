import java.util.*;
class Scores
  {
    public static void main(String[]args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number of games played by Both teams");
      int n=sc.nextInt();
      int a[]=new int[n];
      int b[]=new int[n];
      System.out.println("Enter the scores of the teams");
      for(int i=0;i<n;i++)
        {
          a[i]=sc.nextInt();
          b[i]=sc.nextInt();
        }
      int sum=0;
      for(int i=0;i<n;i++)
        {
          sum=sum+a[i]+b[i];
        }
      System.out.println("Average Score is "+(sum/n*2));
      int max1=a[0];
      int max2=b[0];
      for(int i=0;i<n;i++)
        {
          if(max1<a[i])
          {
            max1=a[i];
          }
        }
      for(int i=0;i<n;i++)
        {
          if(max2<b[i])
          {
            max2=b[i];
          }
        }
      if(max1<max2)
      {
        System.out.println("Highest Score in  all games is "+max1);
      }
      else
      {
        System.out.println("Highest Score in  all games is "+max2);
      }
      int min1=a[0];
      int min2=b[0];
      for(int i=0;i<n;i++)
        {
          if(min1>a[i])
          {
            max1=a[i];
          }
        }
      for(int i=0;i<n;i++)
        {
          if(min2<b[i])
          {
            min2=b[i];
          }
        }
      if(min1>min2)
      {
        System.out.println("Lowest Score in  all games is "+min1);
      }
      else
      {
        System.out.println("Lowest Score in  all games is "+min2);
      }
      int count=0;
      for(int i=0;i<n;i++)
        {
          if(a[i]<b[i])
          {
            count++;
          }
        }
      System.out.println("No of games won : "+count);
      System.out.println("No of games lost : "+(n-count));
    }
  }