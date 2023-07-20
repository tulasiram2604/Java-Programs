/* Create a base class called Animal with a method make_sound that prints a generic sound made by an animal. Create two derived classes, Dog and Cat, that override the make_sound method to print "Woof" and "Meow" respectively. */
class Animal
  {
    void makeSound()
    {
      System.out.println("Generic Sound Made By an Animal");
    }
  }
class Dog extends Animal
  {
    void makeSound()
    {
      System.out.println("Dog barks like Woof");
    }
  }
class Cat extends Animal
  {
    void makeSound()
    {
      System.out.println("Cat Sounds like Meow");
    }
  }
class AnimalSound
  {
    public static void main(String[]args)
    {
      Animal a=new Animal();
      Animal ad=new Dog();
      Animal ac=new Cat();
      a.makeSound();
      ad.makeSound();
      ac.makeSound();
    }
  }