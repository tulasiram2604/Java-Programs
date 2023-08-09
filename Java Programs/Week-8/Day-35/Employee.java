/* Create a Java program that manages an array of Employee objects. Each Employee object should have the following attributes:

employeeId: A unique 4-digit identifier for the employee.
employeeName: The name of the employee (between 3 and 40 characters).
mobileNumber: The employee's mobile number, a 10-digit string that starts with 9, 8, 7, or 6.
salary: The employee's salary, a positive integer not exceeding 1,000,000.
 

The program should allow the user to input data for each employee dynamically with the following validations:

employeeId: Ensure it's a unique 4-digit identifier.
employeeName: Validate that it contains only letters and is between 3 and 40 characters.
mobileNumber: Confirm that it's a 10-digit number starting with 9, 8, 7, or 6.
salary: Validate that it's a positive integer and doesn't exceed 1,000,000.
 

After collecting the data for five employees, display the details for all five employees.

Your program should implement these requirements and ensure that the data collected is accurate and follows the provided validation rules.*/

import java.util.*;
class Employee
  {
    Scanner sc=new Scanner(System.in);
    int eid;
    String ename;
    long mobileno;
    long salary;
   public void createDetails(int eid,String ename,long mobileno,long salary)
    {
      this.eid=eid;
      this.ename=ename;
      this.mobileno=mobileno;
      this.salary=salary;
    }
    public void validateEid(int id)
    {
      int count=0;
      String empid=String.valueOf(id);
      while(count==0)
        {
          if(empid.length()==4)
          {
            System.out.println("Valid Id");
            count++;
          }
          else
          {
            System.out.println("invalid Eid Renter ");
            empid=sc.next();
          }
    }
      eid=Integer.valueOf(empid);
    }
    public void validateEname(String name)
    {
     int count=0;
      while(count==0)
        {
     if((name.length()>=3)&&(name.length()<=40))
      {
        System.out.println("Employee Name valid");
        count++;
      }
      else
      {
        System.out.println("invalid Employee Name ReEnter");
        name=sc.next();
      }
        }
      ename=name;
    }
    public void validateMobileno(long mobileno)
    {
      int count=0;
      String mobilenum=String.valueOf(mobileno);
      while(count==0)
        {
      if(mobilenum.length()==10 && mobilenum.startsWith("9")||mobilenum.startsWith("8")||mobilenum.startsWith("7")||mobilenum.startsWith("6"))
      {
        System.out.println("Mobile no valid");
           count++;
               }
      else{
        System.out.println("invalid Mobile No Reenter");
        mobilenum=sc.next(); 
      }
        }
      mobileno=Long.valueOf(mobilenum);
    }
    public void validatesalary(long sal)
    {
      int count=0;
        while(count==0)
        {
      if(sal<=1000000)
      {
        System.out.println("Valid Salary");
        count++;
      }
      else{
        System.out.println("Salary is Must Less Than 1000000 Reenter the Salary");
        sal=sc.nextLong();
      }
        }
      salary=sal;
    }
    public void display()
    {
      System.out.println("Employee Id "+eid);
      System.out.println("Employee name "+ename);
      System.out.println("Employee Mobile No "+mobileno);
      System.out.println("Employee Salary "+salary+"\n");
    }
    public static void main(String []args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter How Many Deatails you want to enter");
      int size=sc.nextInt();
      Employee emp[]=new Employee[size];
      for(int i=0;i<size;i++)
        {
          emp[i]=new Employee();
      System.out.println("Enter the details of "+(i+1)+" Employee");
          System.out.print("Enter Eid of Employee ");
          emp[i].eid=sc.nextInt();
          emp[i].validateEid(emp[i].eid);
          System.out.println("Enter Ename of the Employee");
          emp[i].ename=sc.next();
          emp[i].validateEname(emp[i].ename);
          System.out.println("Enter Mobileno Of the Employee");
          emp[i].mobileno=sc.nextLong();
          emp[i].validateMobileno(emp[i].mobileno);
          System.out.println("Enter Salary of the Employee");
          emp[i].salary=sc.nextLong();
          emp[i].validatesalary(emp[i].salary);
        }
      System.out.println("\n"+"The Employes Details are");
      for(int i=0;i<emp.length;i++)
        {
          System.out.println("Employee "+(i+1)+" Details are");
         emp[i].display();
        }
    }
  }