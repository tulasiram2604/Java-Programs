import java.util.*;

class MaxofTwoNumbers {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter any number1 value");
    int num1 = s.nextInt();
    System.out.println("Enter number2 value");
    int num2 = s.nextInt();
    if (num1 > num2) {
      System.out.println(num1 + " Number 1 is Maximum");
    } else {
      System.out.println(num2 + " Number 2 is Maximun");
    }
  }
}