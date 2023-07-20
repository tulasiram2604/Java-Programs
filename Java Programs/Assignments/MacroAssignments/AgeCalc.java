import java.util.*;
class AgeCalc
  {
    public static void main(String[]args)
    {
      Scanner s=new Scanner(System.in);
      int present_year,Dob,age;
      System.out.println("Enter the Person's Date of Birth Year");
      Dob=s.nextInt();
      System.out.println("Enter the Present Year");
      present_year=s.nextInt();
      age=present_year-Dob;
      System.out.println("The Present age of the Person is : "+age);
      if(age<18)
      {
        System.out.println("The Person is a Minor");
      }
      else
      {
        System.out.println("The Person is Adult");
      }      
    }
  }