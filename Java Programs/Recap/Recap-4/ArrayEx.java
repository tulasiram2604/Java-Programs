import java.util.*;
class ArrayEx {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter row and coloumn Size of the Matrix");
    int m = sc.nextInt();
    int n = sc.nextInt();
    System.out.println("Enter the Elements in the Array");
    int a[][] = new int[m][n];
    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        a[i][j] = sc.nextInt();
      }
    }
    System.out.println("The Matrix is");
    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        System.out.print(a[i][j] + " ");
      }
      System.out.println();
    }
  }
}