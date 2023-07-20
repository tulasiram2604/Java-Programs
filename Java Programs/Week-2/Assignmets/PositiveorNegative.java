import java.util.*;

class PositiveorNegative {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter any number");
    int num = s.nextInt();
    if (num > 0) {
      System.out.println("Positive Number");
    } else {
      System.out.println("Negative number");
    }
  }
}