import  java.util.*;
class NumberGuessing
  {
    public static void main(String[]args)
    {
      Scanner sc=new Scanner(System.in);
      Random rand=new Random();
      int ran=rand.nextInt(100);
     int i=0;
      while(i==0)
        {
          System.out.println("Guess The Number in between 1 to 100 : ");
          int guess=sc.nextInt();
          if(ran>guess)
          {
            System.out.println("Value is too high than the number! Try again");
          }
          else if(ran<guess)
          {
            System.out.println(" Value is too low than the number! Try Again");
          }
          else
          {
            System.out.println("Your Guss Is Correct The Number "+ran+" is Correct");
            i++;
          }
        }
    }
  }