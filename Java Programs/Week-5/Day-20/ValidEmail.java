/*Email Validation:
Write a program that takes an email address as input and validates whether it is a valid email format. The email should meet the following criteria:
It should contain an "@" and "." symbol.
It should end with ".com" or ".org".
Write a program that prompts the user to enter an email address and performs the validation. Print "Valid email" if the email address is valid, otherwise print "Invalid email".
*/
import java.util.*;
class ValidEmail
  {
    public static void main(String[]args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter a Email");
      String email=sc.nextLine();
      String str[]=email.split(" ");
      for(int i=0;i<str.length;i++)
        {
          if((email.contains("@")&&email.contains("."))&&(email.endsWith(".com")||email.endsWith(".org")))
          {
            System.out.println("Valid Email");
        }
          else
          {
            System.out.println("Invalid Email");
          }
    }
  }
  }