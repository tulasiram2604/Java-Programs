import java.util.*;
class FrequencyChar
  {
    public static void main(String[]args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter a Word");
      String st=sc.next();
      char str[]=st.toCharArray();
      boolean b[]=new boolean[str.length];
      for(int i=0;i<b.length;i++)
        {
          b[i]=false;
        }
      for(int i=0;i<str.length;i++)
        {
          int count=1;
          if (b[i]==true)
            continue;
          for(int j=i+1;j<str.length;j++)
            {
          if(str[i]==(str[j]))
          {
          count++;
            b[j]=true;
          }
            }
      System.out.println("The Character "+str[i]+" Frequency is"+count);
        }
    }
  }