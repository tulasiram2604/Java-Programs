import java.util.Scanner;
class PrintWordsRev
  {
    public static void revWords(String s)
    {
      System.out.println("The Reverse Of words in the Given String");
       String str[]=s.split(" ");
      for(int i=str.length-1;i>=0;i--)
        {
          System.out.println(str[i]+"");
        }
    }
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter The String You Want to reverse");
     String s=sc.nextLine();
      revWords(s);
         }
  }