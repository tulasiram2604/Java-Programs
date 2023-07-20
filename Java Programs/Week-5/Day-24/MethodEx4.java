import java.util.*;
class MethodEx4
  {
    public int multiplication()
    {
     Scanner sc=new Scanner(System.in);
      System.out.println("enter a and b values");
      int a=sc.nextInt();
      int b=sc.nextInt();
      int c=a*b;
      return c;
    }
    public static void main(String args[])
    {
      MethodEx4 m=new MethodEx4();
     int mul=m.multiplication();
      System.out.println(mul);

    }
  }