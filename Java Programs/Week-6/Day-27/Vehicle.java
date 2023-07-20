/* Assignment 2: Multilevel Inheritance
Create a class called "Vehicle" with the following attributes:
String make
String model
int numDoors
boolean is Convertible */
class Vechicles
  {
    void name()
    {
      String name="Mercedes Benz";
      System.out.println("Vechicle name "+name);
    }
  }
class Model extends Vechicles
  {
    void model()
    {
      String model="2023 Mercedes-Benz E-Class";
      System.out.println("Model of the Vechicle is "+model);
    }
  }
class Doors extends Model
  {
    void doors()
    {
      int no=4;
      System.out.println("No of doors vechicle contains "+no+" doors");
    }
  }
class Convertible extends Doors
  {
    void con()
    {
      boolean con=true;
      System.out.println("is Vechicle Convertible "+con);
    }
  }
class Vehicle
  {
public static void main(String[]args)
  {
  Convertible c=new Convertible();
  c.name();
  c.model();
  c.doors();
  c.con();
  }
  }