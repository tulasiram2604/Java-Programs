import java.util.*;

class Grading {
  public static void main(String[] args) {
    double percentage, total_marks;
    Scanner s = new Scanner(System.in);
    System.out.println("Enter Marks in 5 subjects");
    System.out.println("Enter marks in English");
    int eng = s.nextInt();
    System.out.println("Enter marks in Maths");
    int mat = s.nextInt();
    System.out.println("Enter marks in Physics");
    int phy = s.nextInt();
    System.out.println("Enter marks in Chenistry");
    int che = s.nextInt();
    System.out.println("Enter marks in Computer Science");
    int cs = s.nextInt();
    total_marks = (eng + mat + phy + che + cs);
    percentage = ((total_marks / 500) * 100);
    System.out.println("The percentage That Studwent got" + percentage);
    if (percentage >= 90) {
      System.out.println("The student Got Grade A");
    } else if (percentage >= 80) {
      System.out.println("The student Got Grade B");
    } else if (percentage >= 70) {
      System.out.println("The student Got Grade C");
    } else if (percentage >= 60) {
      System.out.println("The student Got Grade D");
    } else if (percentage >= 50) {
      System.out.println("The student Got Grade E");
    } else {
      System.out.println("The Student Failed");
    }
  }
}