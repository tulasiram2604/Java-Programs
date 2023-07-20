import java.util.*;
class NumGuess
  {
    public static void main(String[]args)
    {
      Scanner sc=new Scanner(System.in);
      Random rand=new Random();
      System.out.println("Enter the Range to select a Random Number:");
      int n=sc.nextInt();
      int ans=rand.nextInt(n);
      int i=0;
      while(i==0)
        {
          System.out.println("Guess the Number in between from 1 to "+n+"range");
          int guess=sc.nextInt();
          if(guess==ans)
          {
            System.out.println(guess+"Your Guess Is correct :"+ans+ "is The Random Generated number");
            i++;
          }
          else
          {
            System.out.println("Wrong Guess Try again");
          }
        }
    }
  }