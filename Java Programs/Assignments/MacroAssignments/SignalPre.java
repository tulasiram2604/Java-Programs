import java.util.*;
class SignalPre
  {
    public static void main(String[]args)
    {
      Scanner s=new Scanner(System.in);
      System.out.println("Enter The Time(of 24hrs Time Format) you Want to Predict the Traffic Signal");
      int time=s.nextInt();
      if((time>=6)&&(time<=9))
      {
        System.out.println("The Signal May be Green");
      }
      else if((time>=9)&&(time<=11))
      {
        System.out.println("The Signal May be Red");
      }
      else if((time>=11)&&(time<=13))
      {
        System.out.println("The Signal May be Orange");
      }
      else if((time>=13)&&(time<=17))
      {
        System.out.println("The Signal May be Green");
      }
      else if((time>=17)&&(time<=21))
      {
        System.out.println("The Signal May be Orange");
      }
      else if((time>=21)&&(time<=5))
      {
        System.out.println("The Signal May be Green");
      }
      else
      {
        System.out.println("Inavalid Input");
      }
      System.out.println("Prediction Done");
    }
  }