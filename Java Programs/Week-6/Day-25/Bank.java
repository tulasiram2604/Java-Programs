//Create a class called "BankAccount" with instance variables for storing the account holder's name and account balance. Implement a method named initializeAccount that takes arguments for each variable and initializes the object. Implement another method named displayAccountDetails to display the account holder's name and balance.
class Bank
  {
    String accountHolder;
    double accountBalance;
    public void InitializeAccount(String a,double b)
    {
      accountHolder=a;
      accountBalance=b;
    }
      public void displayAccountDetails()
        {
        System.out.println("name of a customer"+accountHolder);
          System.out.println("account balance of a user is"+accountBalance);
          System.out.println();
        }
    public static void main(String args[])
    {
      Bank ba1=new Bank();
      Bank ba2=new Bank();
      Bank ba3=new Bank();
      ba1.InitializeAccount("Ram",12333.90);
      ba2.InitializeAccount("Ganesh",1674.60);
      ba3.InitializeAccount("Sai",14567.39);
      ba1.displayAccountDetails();
      ba2.displayAccountDetails();
      ba3.displayAccountDetails();
    }
    }