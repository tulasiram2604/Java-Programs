import java.util.*;
class RightRotation
  {
    public static void main(String[]args)
    {
      Scanner sc=new Scanner(System.in);
      int a[]={45,56,45,25,18,65};
      System.out.println("Enter the Position value how many you want to shift");
      int num=sc.nextInt();
      System.out.println("Before Perfoprming Right Rotation");
      for(int i=0;i<a.length;i++)
        {
          System.out.print(a[i]+"\t");
        }
      System.out.println();
      for(int i=0;i<num;i++)
        {
          int temp=a[a.length-1];
          for(int j=a.length-1;j>0;j--)
            {
              a[j]=a[j-1];
            }
          a[0]=temp;
        }
      System.out.println("After Performing Right Rotation by"+num+" position");
      for(int i=0;i<a.length;i++)
        {
          System.out.print(a[i]+"\t");
        }
    }
  }