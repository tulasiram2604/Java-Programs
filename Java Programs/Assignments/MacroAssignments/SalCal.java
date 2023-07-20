import java.util.*;
class SalCal
{
  public static void main(String[]args)
  {
    double sal,annual_sal,net_sal;
    double tax;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the Salary That You get In a month");
    sal=sc.nextInt();
    annual_sal=sal*12;
    System.out.println("Annual Salary of the person : "+annual_sal);
    if((annual_sal>=00000)&&(annual_sal<=1200000))
    {
      tax=(45000+(annual_sal*(15/100)));
      System.out.println("You have to pay the tax of: "+tax);
      net_sal=annual_sal-tax;
      System.out.println("The total amount get the person after paying of tax is : "+net_sal);
    }
    else if((annual_sal>=600000)&&(annual_sal<=900000))
    {
      tax=(15000+(annual_sal*(10/100)));
      System.out.println("You have to pay the tax of: "+tax);
      net_sal=annual_sal-tax;
      System.out.println("The total amount get the person after paying of tax is : "+net_sal);
    }
    else if((annual_sal>=300000)&&(annual_sal<=600000))
    {
      tax=annual_sal*(5/100);
      System.out.println("You have to pay the tax of: "+tax);
      net_sal=annual_sal-tax;
      System.out.println("The total amount get the person after paying of tax is : "+net_sal);
    }
    else
    {
      System.out.println("You Annual Salary less than 3lakhs so you don't need to pay any tax");
    }
  }
}