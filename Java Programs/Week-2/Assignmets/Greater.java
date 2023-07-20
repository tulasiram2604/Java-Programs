import java.util.*;

class Greater {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter any number");
    int num = s.nextInt();
    if (num >= 10) {
      System.out.println("Number is greater than 10");
    } else {
      System.out.println("number is not greater than 10");
    }
  }
}