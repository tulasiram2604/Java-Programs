import java.util.*;
class Addof3num
  {
    public static void addNum(int a,int b, int c)
    {
    int res=a+b+c;
System.out.println("The Addition Of Three Numbers is: "+res);
    }
    public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter Number 1 Value : ");
      int num1=sc.nextInt();
      System.out.println("Enter Number 2 Value : ");
      int num2=sc.nextInt();
      System.out.println("Enter Number 3 Value : ");
      int num3=sc.nextInt();
      addNum(num1,num2,num3);
    }
    }