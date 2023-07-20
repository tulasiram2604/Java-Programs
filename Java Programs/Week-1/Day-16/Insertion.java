import java.util.*;
class Insertion
  {
    public static void insert(int b[],int n,int pos,int val)
    {
for(int i=0;i<b.length-1;i++)
  {
      for(int i=0;i<b.length;i++)
        {
          if(i==pos)
          {
            b[i]=val;
          }
          else if(i>pos)
          {
            b[i]=a[i-1];
          }
          else
          {
            b[i]=a[i];
          }
        }
  }
      System.out.println("The Elements in the Array Are");
      for(int i=0;i<b.length;i++)
        {
          System.out.println(b[i]+"");
        }
    }
    public static void main(String[]args)
    {
      Scanner sc=new Scanner(System.in);
      int b[]={15,62,48,45,74};
      int n=sc.nextInt();
      int b[]=new int[n-a.length];
      System.out.println("Enter the element you want to insert to insert");
      int val=sc.nextInt();
      System.out.println("Enter The Index Position in the array");
      int pos=sc.nextInt();
      insert(a, n,val);
    }
  }