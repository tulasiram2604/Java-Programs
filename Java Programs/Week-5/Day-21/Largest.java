import java.util.*;
class Largest
{
    public static void main(String[] args)
{
        Scanner sc=new Scanner(System.in);
        String st=sc.nextLine();
        String str[]=st.split(" ");
        for(int i=0;i<str.length;i++)
        {
            String temp=str[i];
            String reverse="";
            for(int j=temp.length()-1;j>=0;j--)
              {
                reverse=reverse+temp.charAt(j);
              }
          if(temp.equals(reverse))
          {
        String large="";
  for(int k=0;k<temp.lenth();k++)
    {
      if(temp.length()<large.length())
      {
        large=temp;
      }
    }
  System.out.println("Largest Palindrome word is "+large);
        }
 
        }
    }
}