import java.util.*;
class Array2d
  {
    public static void arrayDim(int a[][],int m,int n)
    {
      for(int i=0;i<m;i++)
        {
          for(int j=0;j<n;j++)
            {
              System.out.print(a[i][j]+"\t");
            }
          System.out.println();
        }
    }
    public static void main(String[]args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the Row size you want in the matrix");
      int m=sc.nextInt();
      System.out.println("Enter the Coloumns Size you want in the matrix");
      int n=sc.nextInt();
      System.out.println("Enter the elements in the Array");
      int a[][]=new int[m][n];
          for(int i=0;i<m;i++)
        {
          for(int j=0;j<n;j++)
            {
              a[i][j]=sc.nextInt();
            }
        }
      arrayDim(a, m, n);
    }
  }