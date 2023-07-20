/* Assignment 3: Method Overloading and Overriding Combined
Create a class BankAccount with methods deposit and withdraw. Implement method overloading to handle different variations of deposit and withdraw methods:
deposit(amount): Deposits the given amount.deposit(amount, description): Deposits the given amount with a provided description.withdraw(amount): Withdraws the given amount.withdraw(amount, description): Withdraws the given amount with a provided description. */
class BankAccount
  {
    double amount=20000;
    void display()
    {
      System.out.println("The Current Available amount in your account is "+amount);
    }
    void deposite(double deposite,String message)
    {
      System.out.println("Enter amount you want to Deposite "+deposite);
        amount=amount+deposite;
      System.out.println(message);
        System.out.println("The remaining Amount "+deposite+"Credited to your account");
        System.out.println("The Amount in your account is "+amount);
    }
      void withdraw(int withdraw,String message)
        {
         if(amount>withdraw)
         {
        amount=amount-withdraw;
        System.out.println(message);
        System.out.println("The Remaining Amount your account is "+amount);
        }
      else
         {
           System.out.println("Insufficient Funds");
         }
    }
  }
    class BankEx
      {
        public static void main(String[]args)
        {
        BankAccount ba=new BankAccount();
        ba.display();
        ba.deposite(1000,"Deposite Sucessful");
        ba.withdraw(2000,"Withdraw Sucessful");
        }
  }