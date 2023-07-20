//Without Return type With Parameters
import java.util.*;
class MaxEle
  {
    public void eleMax(int a[],int n)
    {
      int max=a[0];
        for(int i=0;i<a.length;i++)
        {
          if(max<a[i])
          {
            max=a[i];
          }
        }
      System.out.println("The Maximum Element In the array is : "+max);
    }
    public static void main(String[]args)
    {
      MaxEle me=new MaxEle();
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the Size of the Array");
      int size=sc.nextInt();
      int a[]=new int[size];
      System.out.println("Enter the Elements in the Array");
      for(int i=0;i<size;i++)
        {
          a[i]=sc.nextInt();
        }
      me.eleMax(a,size);
    }
  }