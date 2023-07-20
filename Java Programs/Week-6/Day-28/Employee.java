class Details
  {
    void display(int EmpId)
    {
      System.out.println("Employee id "+EmpId);
    }
    void display(String name)
    {
      System.out.println("Name of the Employee is "+name);
    }
    void display(String company,int sal)
    {
      System.out.println("Name Of the Company "+company);
      System.out.println("Salary of the Employee "+sal);
    }
  }
class Employee
  {
    public static void main(String[]args)
    {
      Details d=new Details();
      d.display(1412);
      d.display("Ram");
      d.display("Bitlabs",10000);
    }
  }