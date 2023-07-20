import java.util.*;

class TempCon {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Temperature");
    int temp = sc.nextInt();
    System.out.println("Enter the Measure of Conversion enter as 'f' for ForeignHeat and 'c' for Centigrade");
    char ch = sc.next().charAt(0);
    if ((ch == 'f') || (ch == 'F')) {
      int rf = ((temp*(9 / 5)) + 32);
      System.out.println("After Conversion the ForeighHeat temperature is : " + rf);
    } else if ((ch == 'c') || (ch == 'C')) {
      int rc = ((temp-32)*(5/9));
      System.out.println("After Conversion the Centigrade temperature is : " + rc);
    } else {
      System.out.println("You Are entered a invalid Input");
    }
    System.out.println("Conversion Done");
  }
}