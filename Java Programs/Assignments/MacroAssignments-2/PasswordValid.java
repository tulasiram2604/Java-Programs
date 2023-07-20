import java.util.*;
class PasswordValid
  {
    public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
      char opt=0;
      do
        {
          int strngpass=2123;
          System.out.println("Enter the Users Password");
          int orignalpass=sc.nextInt();
          if(strngpass==orignalpass)
          {
            System.out.println("Password Is Validation Completed");
          }
          else
          {
            System.out.println("Enter a Valid User's Password");
            System.out.println(" Are you want to reenter select S");
           opt=sc.next().charAt(0);
          }
        }while((opt=='s')||(opt=='S'));
        }
    }