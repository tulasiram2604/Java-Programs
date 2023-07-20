import java.util.*;
class MinWord
  {
    public static void main(String[]args)
    {
      Scanner s=new Scanner(System.in);
      System.out.println("Enter a Sentence");
      String str=s.nextLine();
      String str1[]=str.split(" ");
      int min=str1[0].length();
      String str2="";
      for(int i=0;i<str1.length;i++)
        {
          if(min>str1[i].length())
          {
            min=str1[i].length();
            str2=str1[i];
          }
        }
     System.out.println("Min Word in the Sentence is : "+str2);
    }
  }