import java.util.*;
class Print1toN
  {
    public static void printnum(int n)
    {
      for(int i=1;i<=n;i++)
      {
        System.out.print(i+"\t");
      }
    }
    public static void main(String[]args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the Number you want Upto That Number");
      int n=sc.nextInt();
      printnum(n);
    }
  }