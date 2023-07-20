/* Assignment 1: Single Inheritance
Create a superclass called "Animal" with the following attributes:
String name
int age
String breed */
class Animal
  {
    void name()
    {
      String name="Lion";
      System.out.println("The Name of the Animal is "+name);
    }
    void age()
    {
      int age=30;
      System.out.println("Age of the Animal is "+age);
  }
  }
  class Breed extends Animal
    {
      void breed()
      {
        String breed="American Lion";
        System.out.println("Breed of the Animal "+breed);
      }
    }
    class Animal1
    {
    public static void main(String[]args)
      {
        Breed b=new Breed();
        b.name();
        b.age();
        b.breed();
    }
    }