import java.util.*;

class EqualorNot {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter any number");
    int num1 = s.nextInt();
    System.out.println("Enter any number");
    int num2 = s.nextInt();
    if (num1 == num2) {
      System.out.println("The two Numbers are Equal");
    }
    System.out.println("The two Numbers are not Equal");
  }
}