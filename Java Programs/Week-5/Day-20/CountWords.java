import java.util.*;
class CountWords
  {
    public static void main(String[]args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter a Sentence");
      String str=sc.nextLine();
      String str1[]=str.split(" ");
      for(int i=0;i<str1.length;i++)
        {
          System.out.println("Length of the "+str1[i]+" is "+str1[i].length());
        }
    }
  }