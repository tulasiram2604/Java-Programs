import java.util.*;
class MaxEle 
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter row and coloumn Size of the Matrix");
    int m = sc.nextInt();
    int n = sc.nextInt();
    System.out.println("Enter the Elements in the Array");
    int a[][] = new int[m][n];
    for (int i = 0; i < m; i++) 
    {
      for (int j=0;j<n;j++)
        {
        a[i][j]=sc.nextInt();
      }
    }
    int max=a[0][0];
    for(int i=0;i<m;i++)
      {
      for(int j=0;j<n; j++)
        {
          if(max<a[i][j])
          {
            max=a[i][j];
          }
        }
      }
    System.out.println("The Maximum element in Array is : "+max);
}
}