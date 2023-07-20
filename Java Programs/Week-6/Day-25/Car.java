/* Create a class called "Car" with instance variables for storing the make, model, and year of a car. Implement a method named setCarDetails that takes arguments for each variable and initializes the object. Display the car's details using a separate method. */
class Car
  {
    String cname;
    String model;
    int year;
    public void setCarDetails(String n,String m,int y)
    {
      cname=n;
      model=m;
      year=y;
    }
    public void displayCarDetails()
    {
      System.out.println("The Car name is "+cname);
      System.out.println("The Model is "+model);
      System.out.println("The Car Year of Launch "+year);
      System.out.println();
    }
    public static void main(String[]args)
    {
      Car c1=new Car();
      Car c2=new Car();
      Car c3=new Car();
      Car c4=new Car();
      c1.setCarDetails("Audi","2123e",1990);
      c2.setCarDetails("Mercedes Benz","71734e",1980);
      c3.setCarDetails("BMW","71234r",1950);
      c4.setCarDetails("Rolls Royse","71723e",1930);
      c1.displayCarDetails();
      c2.displayCarDetails();
      c3.displayCarDetails();
      c4.displayCarDetails();
    }
  }