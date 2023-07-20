import java.util.*;

class RPSGame {
  public static void main(String[] args)
    {
      Scanner s=new Scanner(System.in);
    String rock,paper,sciscors;
    System.out.println("Enter the User input as Rock as 'r' or Paper as 'p'or Sciscors as 's'");
    char ui=s.next().charAt(0);
    System.out.println("Enter the Computer input as Rock as r or Paper as p or Scissors as s");
    char ci=s.next().charAt(0);
    if(ui=='r'&&ci=='p')
    {
      System.out.println("Computer wins");
    }
      else if(ui=='p'&&ci=='s')
      {
        System.out.println("Computer wins");    
    }
    else if(ui=='s'&&ci=='r')
{
  System.out.println("Computer wins");
}
else if(ui=='p'&&ci=='r')
    {
      System.out.println("User wins");
    }
      else if(ui=='s'&&ci=='p')
      {
        System.out.println("User wins");    
    }
    else if(ui=='r'&&ci=='s')
{
  System.out.println("User wins");
}
else
    {
      System.out.println("invalid Input");
    }
  }
}