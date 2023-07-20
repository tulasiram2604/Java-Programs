import java.util.*;
class BankTrans
  {
    public static void main(String[]args)
    {
      Scanner s=new Scanner(System.in);
    System.out.println("Welcome to Users Bank");
        System.out.println("Enter the Balance Amount In your Account");
        int ublnc=s.nextInt();
        System.out.println("Enter 1 For Deposite"+"\n"+"Enter 2 For Withdrawl"+"\n"+"Enter 3 For PinChange"+"\n"+"Enter 4 For Balance Enquiry");
        System.out.println("Please enter Any to Perform Action");
        int ch=s.nextInt();
        switch(ch)
          {
            case 1:
              System.out.println("Enter the amount you want to Deposit");
              int dep=s.nextInt();
              int total_amount=dep+ublnc;
              System.out.println("Amount Deposited Successfully");
              System.out.println("Now The Available Balance in Your account is : "+total_amount); 
              break;
            case 2:
              System.out.println("Enter the Amount you want to Withdrawl");
              int withdraw=s.nextInt();
              if(ublnc>withdraw)
              {
                total_amount=ublnc-withdraw;
                System.out.println("Withdraw Successful"+"\n"+"Now the Available Balance in your Account"+total_amount);
              }
              else
              {
                System.out.println("Insufficient Fund");
          }
                break;
            case 3:
              System.out.println("Enter new pin You want to Change");
              int npin=s.nextInt();
              System.out.println("Pin change Successfully");
              break;
            case 4:
              System.out.println("Available Balance in your Account is"+ublnc);
              break;
            case 5:
              System.exit(0);
            default:
              System.out.println("You Choose Invalid Option");
              break;
              }
    }
}