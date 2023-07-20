/* "Employee" with instance variables for storing the employee's name, designation, and salary. Implement a constructor that initializes these variables and display the employee's details. */
class Employee
  {
    String ename;
    String designation;
    int salary;
    public void display()
    {
      System.out.println("Employee name "+ename);
      System.out.println("Employees Designation "+designation);
      System.out.println("Employee's Salary "+salary);
      System.out.println();
    }
    public static void main(String[]args)
    {
      Employee emp=new Employee();
      Employee emp1=new Employee();
      Employee emp2=new Employee();
      emp.ename="Ram";
      emp.designation="Employee";
      emp.salary=25000;
      emp2.ename="Sai Kumar";
      emp2.designation="Employee";
      emp2.salary=30000;
      emp1.ename="Ganesh";
      emp1.designation="Manager";
      emp1.salary=35000;
      emp.display();
      emp1.display();
      emp2.display();
    }
  }