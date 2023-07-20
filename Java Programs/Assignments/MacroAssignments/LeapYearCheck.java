import java.util.*;
class LeapYearCheck{
  public static void main(String[]args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the year you want to check its a Leap year or not");
    int year=sc.nextInt();
    if(((year%4==0)&&(year%100!=0))||(year%400==0))
    {
      System.out.println(+year+" It is a Leap Year");
    }
    else
      System.out.println(+year+" It is not a Leap Year");
      }
}