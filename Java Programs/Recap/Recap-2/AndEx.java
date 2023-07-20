import java.util.*;
class AndEx
  {
    public static void main(String[]args)
    {
      Scanner s=new Scanner(System.in);
      int n1,n2,n3,n4;
      System.out.println("Enter Four Numbers");
      n1=s.nextInt();
       n2=s.nextInt();
       n3=s.nextInt();
       n4=s.nextInt();
      if((n1==n2)&&(n2==n3)&&(n3==n4))
      {
        System.out.println("Four Numbers Are Equal");
      }
      else
      {
      System.out.println("all Four Numbers are not equal");  
      }
    }
  }