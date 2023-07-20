import java.util.*;
class ValidateEmail
  {
    public static void main(String[]args)
    {
      Scanner sc= new Scanner(System.in);
      int acount=0,lcount=0,dcount=0,scount=0,splcount=0;
      char ch;
      System.out.println("Enter Email Id");
      String email=sc.nextLine();
      for(int i=0;i<email.length();i++)
        {
          ch=email.charAt(i);
          if(ch>='A'&&ch<='Z')
          {
            acount++;
          }
          else if(ch>='a'&&ch<='z')
          {
            lcount++;
          }
          else if(ch>='0'&&ch<='9')
          {
            dcount++;
          }
          else if(ch=='@')
          {
            scount++;
          }
          else if(ch=='.')
          {
            splcount++;
          }
        }
      if(acount>0&&lcount>0&&dcount>0&&scount==1&&splcount==1)
      {
        System.out.println("Its a Valid MailId");
      }
      else
      {
        System.out.println("Invalid Mailid");
      }
    }
  }