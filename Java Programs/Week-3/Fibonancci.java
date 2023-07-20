import java.util.*;
class Fibonancci
  {
    public static void main(String[]args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the How many Numbers you want Upto ");
      int first=0,second=1;
      int num=sc.nextInt();
      System.out.println(first+" ");
      System.out.println(second+" ");
      for(int i=1;i<=num;i++)
        {
          int third=first+second;
          System.out.print(third+"\t");
          first=second;
          second=third;
        }
    }
  }