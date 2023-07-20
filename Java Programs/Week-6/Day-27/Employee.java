// when you want to call one constructor in another constructor in the current class
class Employee
  {
   // int x;
    Employee()
    {
      System.out.println("constructor is calling");
    }
    Employee(int x)
    {
      this();
      System.out.println("the value of x is "+x);
    }
    public static void main(String args[])
    {
      Employee emp=new Employee(10);
    }
  }