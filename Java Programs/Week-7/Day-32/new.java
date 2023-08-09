class Customer {
  private long accountno;
  private float balance;
 
  public void setAccountno(long accountno) {
    this.accountno = accountno;
  }
 
  public long getAccountno() {
    return this.accountno;
  }
 
  public void setBalance(float balance) {
    this.balance = balance;
  }
 
  public float getBalance() {
    return this.balance;
  }
}
 
class BankOperation {
  // Customer customer = new Customer();
 
    void deposit(int amount, Customer customer) {
 
    float bal = customer.getBalance();
    System.out.println("the amount after deposited" + bal);
  }
 
  void showDetails(Customer customer) {
    System.out.println("balance is " + customer.getBalance());
    System.out.println("account no is" + customer.getAccountno());
  }
}
class Transaction
  {
    public static void main(String args[]) {
    Customer customer1 = new Customer();
    customer1.setAccountno(123489012345L);
    customer1.setBalance(12000.0f);
    BankOperation transaction = new BankOperation();
    transaction.showDetails(customer1);
    transaction.deposit(2000, customer1);
 
  }
 
  }