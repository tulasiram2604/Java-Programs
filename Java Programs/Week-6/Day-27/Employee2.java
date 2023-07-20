// when you want to call one constructor in another constructor in the current class
class Employee2
  {
   String name;
    int empid;
    String designation;
    float salary;
    Employee2(String name,int empid,String designation)
    {
      this.name=name;
      this.empid=empid;
      this.designation=designation;
    }
    Employee2(String name,int empid,String designation,float salary)
    {
      this(name,empid,designation);
      this.salary=salary;
    }
    void display()
    {
      System.out.println(name+" "+empid+" "+designation+" "+salary);
    }
    public static void main(String args[])
    {
      Employee2 emp=new Employee2("John",123,"manager",12000.0f);
      Employee2 emp1=new Employee2("John",123,"manager");
      emp.display();
      emp1.display();
    }
  }