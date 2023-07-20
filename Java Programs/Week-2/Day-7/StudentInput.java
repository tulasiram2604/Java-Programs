import java.util.Scanner;
class StudentInput
  {
  public static void main(String args[])
    {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter student name");
    String sname = s.next();
    System.out.println("Enter student rollno");
    long rno = s.nextLong();
    System.out.println("Enter student percentage");
    float percentage = s.nextFloat();
    System.out.println("Enter student Grade");
    char grade = s.next().charAt(0);
    System.out.println("student name is :" + sname);
    System.out.println("student roll number :" + rno);
    System.out.println("student percentage :" + percentage);
    System.out.println("student grade :" + grade);
  }
}