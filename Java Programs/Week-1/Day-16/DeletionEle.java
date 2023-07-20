import java.util.*;
class DeletionEle
  {
    public static void detetionEle(int a[],int n,int pos)
    {
      for(int i=pos;i<n-1;i++)
            a[i]=a[i+1];
      System.out.println("After Deleting the elements");
      for(int i=0;i<n-1;i++)
        {
          System.out.println(a[i]);
        }
    }
    public static void main(String[]args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the Size of the Array");
      int n=sc.nextInt();
      int a[]=new int[n];
      System.out.println("Enter the elements in the Array");
      for(int i=0;i<n;i++)
        {
          a[i]=sc.nextInt();
        }
      System.out.println("Enter the position of the element you want to delete");
      int pos=sc.nextInt();
      System.out.println("Elements Before Deleting");
      for(int i=0;i<n;i++)
        {
          System.out.println(a[i]+"");
        }
      detetionEle(a,n,pos);
    }
  }