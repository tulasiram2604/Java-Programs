//ElseIf Sample Code
import java.util.*;
class ElseifEx
  {
    public static void main(String[]args)
    {
      Scanner s=new Scanner(System.in);
      System.out.println("Enter the Person Name");
      String name=s.nextLine();
      if(name.equals("ram"))
      {
        System.out.println("The Person is Ram");
      }
      else if(name.equals("sai"))
      {
        System.out.println("The Person is Sai");
      }
      else if(name.equals("ravi"))
      {
        System.out.println("The Person is Ravi");
      }
      else if(name.equals("ganesh"))
      {
        System.out.println("The Person is Ganesh");
      }
     else if(name.equals("santhosh"))
      {
        System.out.println("The Person is Santhosh");
      }
      else
     {
       System.out.println("Invalid Input");
     }
    }
  }