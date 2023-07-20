//Voting Creteria
import java.util.*;
class Nestedif
  {
    public static void main(String[]args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter Person Age");
      int age=sc.nextInt();
      String cou="india";
      if(cou.equals("india"))
      {
        if(age>18)
        {
           System.out.println("The person is elgible to vote in india");
        }
      }
      else
      {
       System.out.println("Person is not eligible to vote in india");  
      }
    }
  }