import java.util.*;
class ArithemeticMet
  {
    public static void add(int a,int b)
    {
      int add=a+b;
      System.out.println("The Addition Of Two Numbers : "+add);
    }
    public static void sub(int a,int b)
    {
      int sub=a-b;
      System.out.println("The Subtraction Of Two Numbers is "+sub);
    }
    public static void mul(int a,int b)
    {
      int mul=a*b;
      System.out.println("The Multiplication Of Two Numbers is "+mul);
  }
    public static void div(int a,int b)
    {
      int div=a/b;
      System.out.println("The Divison Of Two Numbers is "+div);
  }
    public static void modDiv(int a,int b)
    {
      int mdiv=a*b;
      System.out.println("The Modular Division Of Two Numbers is "+mdiv);
  }
    public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter Number 1");
      int num1=sc.nextInt();
      System.out.println("Enter Number 2");
      int num2=sc.nextInt();
      add(num1,num2);
      sub(num1,num2);
      mul(num1,num2);
      div(num1,num2);
      modDiv(num1,num2);
    }
  }