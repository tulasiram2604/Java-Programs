import java.util.*;

class Percentage {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    double total_marks, obtain_marks, percentage;
    System.out.println("Enter obtain marks");
    obtain_marks = s.nextDouble();
    System.out.println("Enter Total marks");
    total_marks = s.nextDouble();
    percentage = ((obtain_marks / total_marks) * 100);
    System.out.println("The Percentage is" + percentage);
  }
}