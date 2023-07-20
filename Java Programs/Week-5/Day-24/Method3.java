import java.util.*;
class Method3
  {
    public void add()
    {
      Scanner sc=new Scanner(System.in);
      int a,b;
      System.out.println("Enter a,b values For Addition");
      a=sc.nextInt();
      b=sc.nextInt();
      System.out.println("Addition of two Numbers is "+(a+b));
    }
        public void mul()
    {
      Scanner sc=new Scanner(System.in);
      int a,b;
      System.out.println("Enter a,b values Multiplication");
      a=sc.nextInt();
      b=sc.nextInt();
      System.out.println("Multiplication of two Numbers is "+(a*b));
    }
        public void sub()
    {
      Scanner sc=new Scanner(System.in);
      int a,b;
      System.out.println("Enter a,b values for Subtraction");
      a=sc.nextInt();
      b=sc.nextInt();
      System.out.println("Subtration of two Numbers is "+(a-b));
    }
        public void div()
    {
      Scanner sc=new Scanner(System.in);
      int a,b;
      System.out.println("Enter a,b values for Division");
      a=sc.nextInt();
      b=sc.nextInt();
      System.out.println("Division of two Numbers is "+(a/b));
    }
        public void mod()
    {
      Scanner sc=new Scanner(System.in);
      int a,b;
      System.out.println("Enter a,b values for Modular Division Operation");
      a=sc.nextInt();
      b=sc.nextInt();
      System.out.println("Modulo division of two Numbers is "+(a%b));
    }
    public static void main(String[]args)
    {
      Method3 m=new Method3();
      m.add();
      m.mul();
      m.sub();
      m.div();
      m.mod();
    }
}