import java.util.*;
class CalApp
  {
    public static void main(String[]args)
    {
      Scanner sc=new Scanner(System.in);
      int a,b,c;
      System.out.println("Enter The value of A");
      a=sc.nextInt();
      System.out.println("Enter The value of B");
      b=sc.nextInt();
      System.out.println("Enter The Operator to Perform The Operaton");
      System.out.println("Enter + For Addition");
      System.out.println("Enter - For Subtraction");
      System.out.println("Enter * For Multiplication");
      System.out.println("Enter / For Division");
      System.out.println("Enter % For Modular Division");
      char ch=sc.next().charAt(0);
      if(ch=='+')
      {
        c=a+b;
        System.out.println("Addition of Two Numbers is : "+c);
      }
      else if(ch=='-')
      {
        c=a-b;
        System.out.println("Subtraction of Two Numbers is : "+c);
      }
     else if(ch=='*')
      {
        c=a*b;
        System.out.println("Multiplication of Two Numbers is : "+c);
      }
      if(ch=='/')
      {
        c=a/b;
        System.out.println("Division of Two Numbers is : "+c);
      }
      else if(ch=='%')
      {
        c=a%b;
        System.out.println("Modular Division of Two Numbers is : "+c);
      }
      else{
        System.out.println("Invalid Input");
      }
      System.out.println("Operation Done");
    }
  }