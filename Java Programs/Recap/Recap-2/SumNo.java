import java.util.*;
class SumNo
  {
    public static void main(String[]args)
    {
      Scanner s=new Scanner(System.in);
      System.out.println("Enter 5 numbers");
      int n1=s.nextInt();
      int n2=s.nextInt();
      int n3=s.nextInt();
      int n4=s.nextInt();
      int n5=s.nextInt();
      System.out.println("Sum of % numbers is : "+(n1+n2+n3+n4+n5));
      System.out.println("Average of % numbers is : "+((n1+n2+n3+n4+n5)/5));
      
    }
  }