//Method Overloading
class MethodOverloading
  {
    void display()
    {
      System.out.println("this is simple display method");
    }
    void display(String name)
    {
      System.out.println("name is"+name);
    }
    void display(String name,int rollno)
    {
      System.out.println("name is "+name +" "+"rollno is"+rollno);
    }
    void display(int age,String address)
    {
      System.out.println(age+" "+address);
    }
  }
class Test
  {
    public static void main(String args[])
    {
      MethodOverloading mo=new MethodOverloading();
      mo.display();
      mo.display("Ram",23);
      mo.display("Ganesh");
      mo.display(24,"hyd");
    }
  }