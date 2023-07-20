class EmployeeCon
  {
    String ename;
    String designation;
    int salary;
    EmployeeCon(String ename,String designation,int salary)
    {
      System.out.println("Employee Name "+ename);
      System.out.println("Employee Designation "+designation);
      System.out.println("Employee Salary "+salary+"\n");
    }
    public static void main(String[]args)
    {
      EmployeeCon ec1=new EmployeeCon("Ram","Employee",20000);
      EmployeeCon ec2=new EmployeeCon("Ganesh","Manager",40000);
      EmployeeCon ec3=new EmployeeCon("Sau","Asst.Manager",30000);
    }
  }