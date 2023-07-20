//Elgibility criteria of voting
import java.util.*;
class Voting
  {
    public static void main(String[]args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the age Of the Person");
      int age=sc.nextInt();
      if(age>18)
      {
        System.out.println("Person is Elgible for Voting");
      }
      else
      {
        System.out.println("Person is not elgible for Voting");
      }
    }
  }