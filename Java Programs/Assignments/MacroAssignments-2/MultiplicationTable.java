import java.util.*;
class MultiplicationTable
  {
    public static void main(String[]args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number Multiplication Table you Want");
      int n=sc.nextInt();
      System.out.println("Enter the table Range you want Upto");
      int r=sc.nextInt();
      System.out.println("The "+n+" Table upto"+r+"range");
      for(int i=1;i<=r;i++)
        {
          int res=i*n;
      System.out.println(n+"*"+i+"="+res);
        }
    }
  }