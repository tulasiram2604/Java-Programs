import java.util.*;
class FirstOcc
  {
    public static void main(String[]args)
    {
      Scanner sc=new Scanner(System.in);
      int pos=-1;
      System.out.println("Enter A Sentence");
      String str=sc.nextLine();
      System.out.println("Enter the Word You Check For the First Occarance ");
      String word=sc.next();
      String str1[]=str.split(" ");
      for(int i=0;i<str1.length;i++)
        {
          if(word.equals(str1[i]))
          {
            pos=i;
            break;
          }
        }
      if(pos>=0)
      {
      System.out.println("The First Occarance is found at "+pos+ " Position");
    }
      else
      {
        System.out.println("Word Not Found");
      }
  }
  }