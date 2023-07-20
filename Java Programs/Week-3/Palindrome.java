import java.util.*;
class Palindrome
  {
    public static void main(String[]args)
    {
      Scanner sc=new Scanner(System.in);
      int num,digit=0,temp,reverse=0;
      System.out.println("Enter the number you want to Check");
      num=sc.nextInt();
      temp=num;
      while(num>0)
        {
          digit=num%10;
          reverse=(reverse*10)+digit;
          num=num/10;
        }
      if(temp==reverse)
      {
        System.out.println("The Given Number is a palindrolme");
      }
        else
      {
        System.out.println("The Given Number is not A Palindrome");
        }
      }
    }