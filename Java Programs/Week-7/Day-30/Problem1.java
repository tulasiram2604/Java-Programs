class Person
  {
    private String name;
    private int age;
    private String email;
    public void setName(String name)
    {
      this.name=name;
    }
    public String getName()
    {
      return name;
    }
    public void setAge(int age)
    {
      this.age=age;
    }
    public int getAge()
    {
      return age;
    }
    public void setEmail(String email)
    {
      this.email=email;
    }
    public String getEmail()
    {
      return email;
    }
    public void display()
    {
      System.out.println("Person Name "+getName());
      System.out.println("Person Age "+getAge());
      System.out.println("Person Email Id "+getEmail());
    }
  }
class Problem1
  {
    public static void main(String []args)
    {
      Person p=new Person();
      p.setName("Ram");
      p.setAge(23);
      p.setEmail("Ram26@gmail.com");
      p.getName();
      p.getAge();
      p.getEmail();
      p.display();
    }
  }