import java.util.*;
class ValidatePass
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int acount=0,dcount=0,scount=0;
      char ch;
      System.out.println("The Password Must be Equal to 8 Characters only"+"\n"+"The paasword must contains 4 alphabests 2 digits and 2 SplCharacters"+"\n"+"enter your password");
      String password=sc.next();
      if(password.length()==8)
      {
      for(int i=0;i<password.length();i++)
        {
          ch=password.charAt(i);
          if(ch>='a'&& ch<='z')
          {
            acount++;
          }
          else if(ch>='0' && ch<='9')
          {
            dcount++;
          }
                     
       else {
         scount++;
            }
        }
      if((acount==4)&&(dcount==2)&&(scount==2))
      {
        System.out.println("valid password");
      }
      else
      {
        System.out.println("in valid password");
    }
    }
      else
      {
        System.out.println("The password Greater than 8 Characters reenter that");
      }
  }
  }