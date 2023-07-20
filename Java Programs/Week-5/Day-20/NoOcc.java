import java.util.*;
class NoOcc
  {
    public static void main(String[]args)
    {
      Scanner sc=new Scanner(System.in);
      int count=0;
      System.out.println("Enter A Sentence");
      String str=sc.nextLine();
      System.out.println("Enter the Word You Check For the First Occarance ");
      String word=sc.next();
      String str1[]=str.split(" ");
      for(int i=0;i<str1.length;i++)
        {
          if(word.equals(str1[i]))
          {
            count++;
          }
        }
      if(count>=0)
      {
      System.out.println("The word occars in the sentence "+count+" times");
    }
      else
      {
        System.out.println("Word Not Found");
      }
  }
  }