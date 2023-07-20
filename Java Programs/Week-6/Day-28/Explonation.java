//Method Overriding
class Animal
  {
   void sound()
    {
      System.out.println("Different animals can make different sounds");
    }
  }
class Dog extends Animal
  {
    void sound()
    {
      System.out.println("dog sounds like bow bow");
    }
  }
class Cat extends Animal
  {
    void sound()
    {
      System.out.println("cat sounds like meow meow");
    }
  }
class Explonation
  {
    public static void main(String args[])
    {
     Animal animal=new Animal();
      animal.sound();
      Animal dog=new Dog();
      dog.sound();
      Animal cat=new Cat();
      cat.sound();
    }
  }