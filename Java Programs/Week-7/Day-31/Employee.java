class Employee 
{
    int empid;
    String ename;
  String company;
    String address;
  String designation;
  int salary;
  
    public String toString()
    {
        return empid+"\n"+ename+"\n"+company+"\n"+address+"\n"+address+"\n"+designation+"\n"+salary;
    }
    public static void main(String[] args) 
  {
            Employee emp=new Employee();
            emp.empid=281;
            emp.ename="Ram";
            emp.company="Bitlabs";
            emp.address="One Town,Vijayawada";
            emp.designation="Software Intern";
            emp.salary=10000;
            System.out.println(emp);
          
    }
}