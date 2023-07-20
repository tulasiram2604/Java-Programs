import java.util.*;
class MaxWord
  {
    public static void main(String[]args)
    {
      Scanner s=new Scanner(System.in);
      System.out.println("Enter a Sentence");
      String str=s.nextLine();
      String str1[]=str.split(" ");
      int max=str1[0].length();
      String str2="";
      for(int i=0;i<str1.length;i++)
        {
          if(max<str1[i].length())
          {
            max=str1[i].length();
            str2=str1[i];
          }
        }
     System.out.println("Max Word in the Sentence is : "+str2);
    }
  }