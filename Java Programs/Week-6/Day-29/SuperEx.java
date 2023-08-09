//when we have parent and child class having the same variable name then if you are calling the parent class variable in the child class we have to use super keyword to refer parent class variable
class Animal
  {
    String name="wild";
    String color="black";
  }
class Dog extends Animal
{
  String dogName="puppy";
  String color="white";
  void display()
  {
    System.out.println(name+" "+super.color);
    System.out.println(dogName+" "+color);
  }
}
  class SuperEx
    {
      public static void main(String args[])
      {
      Dog dog=new Dog();
      dog.display();
    }
  
}