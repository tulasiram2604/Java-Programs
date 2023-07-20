/* Create a class called "Car" with instance variables for storing the make, model, and year of a car. Implement a constructor that initializes these variables and display the car's details. */
class CarDetails
  {
    String cname;
    String cmodel;
    int year;
      public void display()
        {
        System.out.println("The Car name is "+cname);
        System.out.println("The Car Model is "+cmodel);
        System.out.println("The Car year of Manufacture is "+year);
          System.out.println();
        }
      public static void main(String[]args)
    {
      CarDetails cd=new CarDetails();
      CarDetails cd1=new CarDetails();
      CarDetails cd2=new CarDetails();
      cd.cname=" Audi";
      cd.cmodel="c2132";
      cd.year=1960;
      cd1.cname=" Mercedes Benz";
      cd1.cmodel="M21902";
      cd1.year=1980;
      cd2.cname=" BMW";
      cd2.cmodel="B2745";
      cd2.year=1995;
      cd.display();
      cd1.display();
      cd2.display();
    }
  }