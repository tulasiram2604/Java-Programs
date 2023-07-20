import java.util.*;
class LeftRotation
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int a[]=new int{21,52,14,36,25,12};
      System.out.println("enter the position value how many you want to shift");
      int number=sc.nextInt();
      System.out.println("Befor perfroming left roatation  ");
      for(int i=0;i<a.length;i++)
        {
          System.out.print(a[i]+" ");
        }
      System.out.println();
      for(int i=0;i<number;i++)
        {
      int temp=a[0];
      for(int j=0;j<a.length-1;j++)
        {
          a[j]=a[j+1];
        }
      a[a.length-1]=temp;
    }
      System.out.println("after perfroming left roatation by "+number+" position ");
      for(int i=0;i<a.length;i++)
        {
          System.out.print(a[i]+" ");
        }
    }
  }