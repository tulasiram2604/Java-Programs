import java.util.*;

class EvenorOdd {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter any number");
    int num = s.nextInt();
    if (num % 2 == 0) {
      System.out.println("Even Number");
    } else {
      System.out.println("odd number");
    }
  }
}