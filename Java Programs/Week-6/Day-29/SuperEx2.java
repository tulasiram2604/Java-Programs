class Person
  {
    String name="Ram";
    int no=81;
      void display()
        {
        System.out.println(name);
        System.out.println(no);
        }
    }
class Student extends Person
  {
    String sname="Tulasi Ram";
    int rno=4132;
    void display()
    {
      System.out.println(sname);
      System.out.println(rno);
      display();
    }
    void getDetails()
    {
      super.display();
      display();
    }
  }
class SuperEx2
  {
public static void main(String []args)
  {
  Student st=new Student();
    st.getDetails();
  }
  }