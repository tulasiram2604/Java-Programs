import java.util.*;

class Divisible5 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter any number1 value");
    int num = s.nextInt();
    if (num % 5 == 0) {
      System.out.println(num + " Number is Divisible by 5");
    } else if (num % 11 == 0) {
      System.out.println(num + " Number is Divisible by 11");
    } else {
      System.out.println(num + " Number is divisible ny some other number");
    }
  }
}