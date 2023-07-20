/* Create a class called "Employee" with instance variables for storing the employee's name, designation, and salary. Implement a method named setEmployeeDetails that takes arguments for each variable and initializes the object. Implement another method named displayEmployeeDetails to display the employee's details*/
class Employe
  {
    String ename;
    String designation;
    int salary;
      public void setEmployeeDetails(String n,String d,int s)
        {
       ename=n;
        designation=d;
        salary=s;
        }
      public void displayEmployeeDetails()
        {
        System.out.println("The Employee Name is "+ename);
        System.out.println("The Employee designation is "+designation);
        System.out.println("Employee Salary is is "+salary);
          System.out.println();
        }
      public static void main(String[]args)
        {
        Employe e1=new Employe();
        Employe e2=new Employe();
       Employe e3=new Employe();
        e1.setEmployeeDetails("Ram","Employee",20000);
        e2.setEmployeeDetails("Ganesh","Manager",40000);
        e3.setEmployeeDetails("Sai","Asst.Manager",35000);
        e1.displayEmployeeDetails();
        e2.displayEmployeeDetails();
        e3.displayEmployeeDetails();
        }
    }