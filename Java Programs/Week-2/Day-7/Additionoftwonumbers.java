import java.util.*;

class Additionoftwonumbers {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int a, b,c;
    System.out.println("Enter the value of a");
    a = s.nextInt();
    System.out.println("Enter the value of b");
    b = s.nextInt();
    c = a + b;
    System.out.println("The addition of two numbers is" + c);
  }
}