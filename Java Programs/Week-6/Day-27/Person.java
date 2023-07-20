/* Assignment 4: Hybrid Inheritance
Create a superclass called "Person" with the following attributes:
String name
int age
double salary
String major
double gpa
String company */
class Details
  {
    void name()
      {
        String name="Ram";
        System.out.println("Name of the Person is "+name);
      }
  }
    class Age extends Details
      {
        void age()
        {
          int age=20;
        System.out.println("The Age of the Person is "+age+" years");
      }
      }
class Salary extends Age
      {
        void sal()
        {
          int sal=25000;
        System.out.println("Salary of the person is "+sal);
      }
        void major()
        {
          String maj="Post Graduate";
          System.out.println("The Major Education of the Person is "+maj);
        }
      }
class Company extends Age
      {
        void gpa()
        {
        double gpa=8.9;
        System.out.println("The GPA of the Person is "+gpa);
      }
        void com()
        {
          String company="Bitlabs";
          System.out.println("The Person Working in company is "+company);
        }
      }
    class Person
      {
    public static void main(String[]args)
    {
      Salary s=new Salary();
     Company c=new Company();
      s.name();
      s.age();
      s.sal();
      s.major();
      c.gpa();
      c.com();
    }
  }