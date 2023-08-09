/* Assignment 3: Student Information System
Create a class named "Student" with private attributes: name, rollNumber, age, and marks.
Implement getter and setter methods for all attributes.
Ensure that the marks attribute can only be accessed through getter and setter methods, not directly.
Add a method named calculateGrade() that calculates the grade based on the marks and returns it as a string (e.g., "A+", "B", "C", etc.).
Add a method named displayDetails() that displays the student's name, roll number, age, marks, and grade.
In the main method, create an array of Student objects to store information for multiple students. Prompt the user to input data for each student, calculate their grades, and display their details. */
import java.util.*;
class Student
  {
  private String name;
  private int rollno;
    private int age;
    private int marks;
    public void setName(String name)
    {
      this.name=name;
    }
    public String getName()
    {
      return name;
    }
    public void setRollNo(int rollno)
    {
      this.rollno=rollno;
    }
    public int getRollNo()
    {
      return rollno;
    }
    public void setAge(int age)
    {
      this.age=age;
    }
    public int getAge()
    {
      return age;
    }
    public void setMarks(int marks)
    {
      this.marks=marks;
    }
    public int getMarks()
    {
      return marks;
    }
    public void display()
    {
      System.out.println(" Student name "+getName());
      System.out.println("Student Roll no "+getRollNo());
      System.out.println("Student Age "+getAge());
      System.out.println("Student marks "+getMarks());
    }
    public void GradeCal()
    {
      if (marks >= 90) 
      {
      System.out.println("The student Got Grade A");
    } 
      else if (marks >= 80)
      {
      System.out.println("The student Got Grade B");
    }
      else if (marks >= 70) 
      {
      System.out.println("The student Got Grade C");
    } 
      else if (marks >= 60) 
      {
      System.out.println("The student Got Grade D");
    } 
      else if (marks >= 50)
      {
      System.out.println("The student Got Grade E");
    }
      else 
      {
      System.out.println("The Student Failed");
    }
    }
  }
    class Problem3
      {
        public static void main(String[]args)
        {
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter the Number of Students Details you want to enter");
          int size=sc.nextInt();
          Student st[]=new Student[size];
          for(int i=0;i<size;i++)
          {
            System.out.println("Enter "+(i+1)+" Student Deatils");
            st[i]=new Student();
            System.out.println("Enter Student name ");
          st[i].setName(sc.next());
            System.out.println("Enter Student Roll Number ");
          st[i].setRollNo(sc.nextInt());
            System.out.println("Enter Student Age");
          st[i].setAge(sc.nextInt());
            System.out.println("Enter Student marks ");
          st[i].setMarks(sc.nextInt());
          }
          for(int i=0;i<size;i++)
            {
              st[i].display();
          st[i].GradeCal();
        }
      }
      }