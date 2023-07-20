import java.util.*;
class Method2
  {
    public void multiplication(int a,int b)
    {
      System.out.println("The Multiplication of two Numbers is "+(a*b));
    }
    public static void main(String[]args)
    {
      Method2 m=new Method2();
      Scanner sc=new Scanner(System.in);
     System.out.println("Enter a and b values");
      int a=sc.nextInt();
      int b=sc.nextInt();
      m.multiplication(a,b);
    }
  }