class Employee
  {
    private int eid;
    private String ename;
    public void setEmpId(int eid)
    {
      this.eid=eid;
    }
    public int getEmpId()
    {
      return eid;
    }
    public void setEmpName(String ename)
    {
      this.ename=ename;
    }
    public String getEmpName()
    {
      return ename;
    }
  }
class Encapsulation2
  {
  public static void main(String args[])
    {
      Employee emp=new Employee();
      emp.setEmpId(2108);
      emp.setEmpName("Ram");
    System.out.println(emp.getEmpId());
    System.out.println(emp.getEmpName());
    }
  }