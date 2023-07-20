/* Design a class Vehicle with a method start_engine that prints a generic message like "Engine starting." Create two derived classes, Car and Motorcycle, that override the start_engine method with more specific messages like "Car engine starting" and "Motorcycle engine starting." */
class Vehicle
  {
    void start_engine()
    {
      System.out.println("Engine Starting");
    }
  }
class Car extends Vehicle
  {
    void start_engine()
    {
      System.out.println("Car Engine starting");
    }
  }
class MotorCycle extends Vehicle
  {
    void start_engine()
    {
      System.out.println("Motorcycle engine starting");
    }
  }
class Vehicles
  {
    public static void main(String[]args)
    {
      Vehicle v=new Vehicle();
      Vehicle vc=new Car();
      Vehicle vm=new MotorCycle();
      v.start_engine();
      vc.start_engine();
      vm.start_engine();
    }
  }