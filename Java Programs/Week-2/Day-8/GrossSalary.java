import java.util.Scanner;

class GrossSalary {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter basic salary");
    double salary = sc.nextDouble();
    if (salary <= 10000) {
      double hra = (salary*20) / 100;
      double da = (salary*80) / 100;
      double grosssalary = (salary+hra+da);
      System.out.println("grosssalary"+grosssalary);
    } 
    else if (salary <= 20000)
    {
      double hra =(salary*25)/ 100;
      double da = (salary*90) / 100;
      double grosssalary=(salary+hra +da);
      System.out.println("grosssalary"+grosssalary);
    } 
    else 
    {
      double hra = (salary*30) / 100;
      double da = (salary*95)/ 100;
      double grosssalary =(salary+hra+da);
      System.out.println("grosssalary"+grosssalary);
    }
  }
}