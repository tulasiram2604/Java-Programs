import java.util.*;
class Cubes
  {
    public static void main(String[]args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter The Number");
      int n=sc.nextInt();
      for(int i=1;i<=n;i++)
        {
          int res=i*i*i;
          System.out.println("The Cube of "+i+" is"+res);
        }
    }
  }