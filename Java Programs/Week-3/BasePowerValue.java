import java.util.*;
class BasePowerValue
  {
    public static void main(String[]args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter The Base Value");
      int b=sc.nextInt();
      System.out.println("Enter the Power Value");
      int p=sc.nextInt();
      int res=1;
      for(int i=1;i<=p;i++)
        {
          res=res*b;
        }
      System.out.println("The Value of "+b+" power "+p+"is : "+res);
    }
  }