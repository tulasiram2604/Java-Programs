import java.util.*;

class MaxofThreeNumbers {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter any number1 value");
    int num1 = s.nextInt();
    System.out.println("Enter number2 value");
    int num2 = s.nextInt();
    System.out.println("Enter any number3 value");
    int num3 = s.nextInt();

    if ((num1 > num2) && (num1 > num3)) {
      System.out.println(num1 + " Number 1 is Maximum");
    } else if (num2 > num3) {
      System.out.println(num2 + " Number 2 is Maximun");
    } else {
      System.out.println(num3 + " Number 3 is Maximun");
    }
  }
}