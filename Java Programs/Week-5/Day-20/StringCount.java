import java.util.*;
class StringCount
  {
    public static void main(String[]args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter a Sentence");
      int a=0,d=0,s=0;
      String st=sc.nextLine();
      for(int i=0;i<st.length();i++)
        {
          if(st.charAt(i)>='a'&& st.charAt(i)<='z'||st.charAt(i)>='A'&& st.charAt(i)<='Z')
          {
            a++;
          }
          else if(st.charAt(i)>='0'&&st.charAt(i)<='9')
          {
            d++;
          }
          else{
            s++;
          } 
        }
      System.out.println("Alphabets in Sentence is : "+a);
      System.out.println("Numerics in Sentence is : "+d);
      System.out.println("Spl Characters in Sentence is : "+s);
    }
  }