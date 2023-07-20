import java.util.*;
class Varable {
  public static void main(String[] agrs) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Any character");
    char ch = sc.next().charAt(0);
    if ((ch >= 'a' && ch <= 'z') || ch >= 'A' && ch <= 'Z') {
      System.out.println("The Given value is a Alphabet");
    } else if (ch >= '0' && ch <= '9') {
      System.out.println("The Given value is a Number");
    } else {
      System.out.println("The Given value is a Special Character");
    }
  }
}
