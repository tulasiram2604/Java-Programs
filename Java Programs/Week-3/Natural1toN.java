import java.util.*;
class Natural1toN
  {
    public static void main(String[]args)
    {
      Scanner s=new Scanner(System.in);
      System.out.println("Enter the Number you want Natural Numbers upto That");
      int n=s.nextInt();
      System.out.println("The natural numbers from1 to"+n+" Numbers are : ");
      int i=1;
      while(i<=n)
        {
          System.out.print(i+"\t");
          i++;
        }
    }
  }