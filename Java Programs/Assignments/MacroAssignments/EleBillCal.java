import java.util.*;
class EleBillCal
  {
    public static void main(String[]args)
    {
      Scanner sc=new Scanner(System.in);
      int units,Gst=10;
        double bill;
      System.out.println("Enter the Units you Consumed In this Month");
      units=sc.nextInt();
      System.out.println(" Then The bill caculated based on units");
      if((units>=1)&&(units<=30))
         {
        bill=((units*1.9)+Gst);
        System.out.println("The Amount have to pay the bill is: "+bill);
         }
      else if((units>=31)&&(units<=75))
         {
        bill=(units*3)+Gst;
        System.out.println("The Amount have to pay the bill is: "+bill);
         }
      else if((units>=76)&&(units<=125))
         {
        bill=((units*4.5)+Gst);
        System.out.println("The Amount have to pay the bill is: "+bill);
         }
      else if((units>=126)&&(units<=225))
         {
        bill=((units*6)+Gst);
        System.out.println("The Amount have to pay the bill is: "+bill);
         }
      else if((units>=226)&&(units<=400))
         {
        bill=((units*9.75)+Gst);
        System.out.println("The Amount have to pay the bill is: "+bill);
         }
      else if(units>400)
         {
        bill=((units*3)+Gst);
        System.out.println("The Amount have to pay the bill is: "+bill);
         }
      System.out.println("Bill Caculation Done");
    }
  }